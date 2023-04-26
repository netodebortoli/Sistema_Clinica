package Dominio;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Consulta {

    private int idConsulta;
    private Date data;
    private String horario;
    private Medico medico;
    private Paciente paciente;
    private Especialidade modalidade;
    private boolean concluida;

    public Consulta(int idConsulta, Date data, String horario, Medico medico, Paciente paciente, Especialidade modalidade, boolean concluida) {
        this.idConsulta = idConsulta;
        this.data = data;
        this.horario = horario;
        this.medico = medico;
        this.paciente = paciente;
        this.modalidade = modalidade;
        this.concluida = concluida;
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

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}
