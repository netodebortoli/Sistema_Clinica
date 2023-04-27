package Dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Admin
 */
@Entity
public class Consulta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConsulta;

    @Temporal(TemporalType.DATE)
    private Date data;

    @Column(length = 3, nullable = false)
    private String horario;

    private Medico medico;

    private Paciente paciente;

    private Especialidade modalidade;

    public Consulta(int idConsulta, Date data, String horario, Medico medico, Paciente paciente, Especialidade modalidade) {
        this.idConsulta = idConsulta;
        this.data = data;
        this.horario = horario;
        this.medico = medico;
        this.paciente = paciente;
        this.modalidade = modalidade;

    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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

    public Especialidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Especialidade modalidade) {
        this.modalidade = modalidade;
    }

}
