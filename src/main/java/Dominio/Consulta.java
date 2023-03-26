package Dominio;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Consulta {

    private int id_consulta;
    private Date data;
    private String horario;
    private Medico medico;
    private Paciente paciente;
    private Modalidade modalidade;
    private boolean concluida;
    
    public Consulta(Date data, String horario, Medico medico, Paciente paciente, Modalidade modalidade, boolean concluida) {
        this.data = data;
        this.horario = horario;
        this.medico = medico;
        this.paciente = paciente;
        this.modalidade = modalidade;
        this.concluida = concluida;
    }

    public int getId_consulta() {
        return id_consulta;
    }

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
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

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}
