package Dominio;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Paciente extends Pessoa {

    private String observacao;

    public Paciente(String observacao, String nome, Date dataNascimento, String cpf, String rg, char sexo, String email, String telefone, String celular, String cep, String cidade, String bairro, String rua, int numero, String uf) {
        super(nome, dataNascimento, cpf, rg, sexo, email, telefone, celular, cep, cidade, bairro, rua, numero, uf);
        this.observacao = observacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
