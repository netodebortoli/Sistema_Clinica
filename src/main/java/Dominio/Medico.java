package Dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
public class Medico extends Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pessoa")
    private int id;

    @Column(length = 250, nullable = false, name = "nome_pessoa")
    private String nome;

    @Column (nullable = false, length = 10, unique = true)
    private int crm;

    @Column (nullable = false, length = 30)
    private String crmUf;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "medico_especialidade",
            joinColumns = {
                @JoinColumn(name = "id_medico")},
            inverseJoinColumns = {
                @JoinColumn(name = "id_especialidade")})
    private List<Especialidade> especialidades = new ArrayList();

    @OneToMany (mappedBy = "medico" , fetch = FetchType.LAZY)
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
