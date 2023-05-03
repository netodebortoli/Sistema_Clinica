package Dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Especialidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_especialidade")
    private int idEspecialidade;

    @Column(length = 30, nullable = false)
    private String descricao;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "medico_especialidade",
            joinColumns = {
                @JoinColumn(name = "id_especialidade")},
            inverseJoinColumns = {
                @JoinColumn(name = "id_medico")})
    private List<Medico> medicos = new ArrayList();

    @OneToMany(mappedBy = "especialidade", fetch = FetchType.LAZY)
    @Column(insertable = false, nullable = true)
    private List<Consulta> consultas = new ArrayList();

    public Especialidade(int idEspecialidade, String descricao) {
        this.idEspecialidade = idEspecialidade;
        this.descricao = descricao;
    }

    public int getIdEspecialidade() {
        return idEspecialidade;
    }

    public void setIdEspecialidade(int idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
