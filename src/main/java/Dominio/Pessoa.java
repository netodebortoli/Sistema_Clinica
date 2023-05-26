
package Dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Inheritance (strategy = InheritanceType.JOINED)
public abstract class Pessoa implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_pessoa")
    private int id;
    
    @Column (length = 100, nullable = false, name = "nome_pessoa")
    private String nome;
    
    @Temporal (TemporalType.DATE)
    @Column (nullable = false, updatable = false, name = "data_nascimento")
    private Date dataNascimento;
    
//    @Column (length = 11, nullable = false, updatable = false, unique = true)
    @Column (length = 11, nullable = false, updatable = false)
    private String cpf;
    
    @Column (nullable = false, length = 1)
    private String sexo;

    @Column (length = 11)
    private String celular;
    
    @Column (length = 9, nullable = false)
    private String cep;
     
    @Column (nullable = false, length = 50)
    private String cidade;
    
    @Column (nullable = false, length = 50)
    private String bairro;

    @Column (nullable = false)
    private String rua;
    
    @Column (nullable = true)
    private Integer numero;
    
    @Column (length = 2, nullable = false)
    private String uf;

    public Pessoa(String nome, Date dataNascimento, String cpf, String sexo, String celular, String cep, String cidade, String bairro, String rua, Integer numero, String uf) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.sexo = sexo;
        this.celular = celular;
        this.cep = cep;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.uf = uf;
    }
    
    public Pessoa() {}

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return nome ;
    }
}
