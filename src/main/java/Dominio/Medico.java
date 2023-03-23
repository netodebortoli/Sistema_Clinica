package Dominio;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Medico extends Pessoa {

    private int crm;
    private String uf_crm;
    private Modalidade especialidades[];

    public Medico(int crm, String uf_crm, Modalidade[] especialidades, String nome, Date dataNascimento, String cpf, String rg, char sexo, String email, String telefone, String celular, String cep, String cidade, String bairro, String rua, int numero, String uf) {
        super(nome, dataNascimento, cpf, rg, sexo, email, telefone, celular, cep, cidade, bairro, rua, numero, uf);
        this.crm = crm;
        this.uf_crm = uf_crm;
        this.especialidades = especialidades;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getUf_crm() {
        return uf_crm;
    }

    public void setUf_crm(String uf_crm) {
        this.uf_crm = uf_crm;
    }

    public Modalidade[] getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Modalidade[] especialidades) {
        this.especialidades = especialidades;
    }
}
