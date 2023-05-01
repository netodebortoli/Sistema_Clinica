package Dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Consulta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consulta")
    private int idConsulta;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_consulta", nullable = false)
    private Date dataConsulta;

    @Column(length = 3, nullable = false)
    private String horario;

//    @ManyToOne (fetch = FetchType.EAGER)
//    @JoinColumn(name = "id_medico")
    @Transient
    private Medico medico;

//    @ManyToOne (fetch = FetchType.EAGER)
//    @JoinColumn(name = "id_paciente")
    @Transient
    private Paciente paciente;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_especialidade")
    private Especialidade especialidade;

    public Consulta(int idConsulta, Date dataConsulta, String horario, Medico medico, Paciente paciente, Especialidade especialidade) {
        this.idConsulta = idConsulta;
        this.dataConsulta = dataConsulta;
        this.horario = horario;
        this.medico = medico;
        this.paciente = paciente;
        this.especialidade = especialidade;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
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

}
