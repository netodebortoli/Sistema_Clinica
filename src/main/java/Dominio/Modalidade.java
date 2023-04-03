package Dominio;

public class Modalidade {

    private String id_modalidade;
    private String descricao;
    
    public Modalidade(String descricao) {
        this.descricao = descricao;
    }

    public String getId_modalidade() {
        return id_modalidade;
    }

    public void setId_modalidade(String id_modalidade) {
        this.id_modalidade = id_modalidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
