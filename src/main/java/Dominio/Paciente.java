package Dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "id_paciente")
public class Paciente extends Pessoa implements java.io.Serializable {
    
    private String observacao;

    @Column (length = 2, nullable = false, name = "tipo_sanguineo")
    private String tipoSanguineo;

    @OneToMany (mappedBy = "paciente", 
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Consulta> consultas = new ArrayList();

    public Paciente(String observacao, String tipoSanguineo, String nome, Date dataNascimento, String cpf, String sexo, String celular, String cep, String cidade, String bairro, String rua, Integer numero, String uf) {
        super(nome, dataNascimento, cpf, sexo , celular, cep, cidade, bairro, rua, numero, uf);
        this.observacao = observacao;
        this.tipoSanguineo = tipoSanguineo;
    }

    public Paciente() {}
    
    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
