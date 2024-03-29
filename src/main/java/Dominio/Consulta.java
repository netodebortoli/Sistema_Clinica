package Dominio;

import Controle.CalcularConsultaConvenio;
import Controle.CalcularConsultaParticular;
import Controle.PrecoConsulta;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Consulta implements Serializable {

    @Transient
    public static final int CONVENIO = 1;

    @Transient
    public static final int PARTICULAR = 2;

    @Transient
    private PrecoConsulta precoConsulta = null;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consulta")
    private int idConsulta;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_consulta", nullable = false)
    private Date dataConsulta;

    @Column(length = 3, nullable = false)
    private String horario;

    @Column
    private Double preco;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_medico")
    private Medico medico;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_especialidade")
    private Especialidade especialidade;

    public Consulta(Date dataConsulta, String horario, Medico medico, Paciente paciente, Especialidade especialidade, int tipoConsulta, Double preco) {
        this.dataConsulta = dataConsulta;
        this.horario = horario;
        this.medico = medico;
        this.paciente = paciente;
        this.especialidade = especialidade;
        this.preco = preco;
        
        switch (tipoConsulta) {
            case CONVENIO:
                precoConsulta = new CalcularConsultaConvenio();
                break;
            case PARTICULAR:
                precoConsulta = new CalcularConsultaParticular();
                break;
        }

        calcularPrecoConsulta();
    }

    private void calcularPrecoConsulta() {
        if (precoConsulta != null) this.preco = precoConsulta.calcularPrecoConsulta(this);
    }
    
    public Consulta() {
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return paciente.getNome();
    }

    public String getDtConsultaFormatada() throws ParseException {
        return Controle.FuncoesUteis.dateToStr(dataConsulta);
    }

    public Object[] toArray() throws ParseException {
        return new Object[]{getDtConsultaFormatada(), horario, medico, this, especialidade};
    }

}
