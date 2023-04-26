package Dominio;

public class Especialidade {

    private String idEspecialidade;
    private String descricao;

    public Especialidade(String idEspecialidade, String descricao) {
        this.idEspecialidade = idEspecialidade;
        this.descricao = descricao;
    }

    public String getIdEspecialidade() {
        return idEspecialidade;
    }

    public void setIdEspecialidade(String idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
