package Dominio;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Medico extends Pessoa {

    private int crm;
    private String crmUf;
    private Especialidade especialidades[];

    public Medico(int crm, String crmUf, Especialidade[] especialidades, String nome, Date dataNascimento, String cpf, char sexo, String telefone, String celular, String cep, String cidade, String bairro, String rua, int numero, String uf) {
        super(nome, dataNascimento, cpf, sexo, telefone, celular, cep, cidade, bairro, rua, numero, uf);
        this.crm = crm;
        this.crmUf = crmUf;
        this.especialidades = especialidades;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getCrmUf() {
        return crmUf;
    }

    public void setCrmUf(String crmUf) {
        this.crmUf = crmUf;
    }

    public Especialidade[] getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Especialidade[] especialidades) {
        this.especialidades = especialidades;
    }
}
