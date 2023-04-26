package Dominio;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Paciente extends Pessoa {

    private String observacao;
    private String tipoSanguineo;

    public Paciente(String observacao, String tipoSanguineo, String nome, Date dataNascimento, String cpf, char sexo, String telefone, String celular, String cep, String cidade, String bairro, String rua, int numero, String uf) {
        super(nome, dataNascimento, cpf, sexo, telefone, celular, cep, cidade, bairro, rua, numero, uf);
        this.observacao = observacao;
        this.tipoSanguineo = tipoSanguineo;
    }

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
