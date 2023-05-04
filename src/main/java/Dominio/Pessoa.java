
package Dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id_pessoa")
    private int id;
    
    @Column (length = 100, nullable = false, name = "nome_pessoa")
    private String nome;
    
    @Temporal (TemporalType.DATE)
    @Column (nullable = false, updatable = false, name = "data_nascimento")
    private Date dataNascimento;
    
    @Column (length = 14, nullable = false,  unique = true, updatable = false)
    private String cpf;
    
    @Column (nullable = false, length = 1)
    private char sexo;
    
    @Column (length = 13)
    private String telefone;
    
    @Column (length = 14)
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
    private int numero;
    
    @Column (length = 50, nullable = false)
    private String uf;

    public Pessoa(String nome, Date dataNascimento, String cpf, char sexo, String telefone, String celular, String cep, String cidade, String bairro, String rua, int numero, String uf) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.sexo = sexo;
        this.telefone = telefone;
        this.celular = celular;
        this.cep = cep;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.uf = uf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
