package Dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Medico extends Pessoa {

    //@Column (nullable = false, length = 10, unique = true)
    private int crm;

    //@Column (nullable = false, length = 30)
    private String crmUf;

    // Relacionamento N...N
    private List<Especialidade> especialidades = new ArrayList();

    //@OneToMany (mappedBy = "medico" , fetch = FetchType.LAZY)
    //@Column (insertable = null, nullable = true)
    private List<Consulta> consultas = new ArrayList();

    public Medico(int crm, String crmUf, List<Especialidade> especialidades, String nome, Date dataNascimento, String cpf, char sexo, String telefone, String celular, String cep, String cidade, String bairro, String rua, int numero, String uf) {
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

    public List<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

}
