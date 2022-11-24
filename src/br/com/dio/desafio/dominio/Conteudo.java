package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;

    private String _titulo;
    private String _descricao;

    public String get_titulo() {
        return _titulo;
    }

    public void set_titulo(String _titulo) {
        this._titulo = _titulo;
    }

    public String get_descricao() {
        return _descricao;
    }

    public void set_descricao(String _descricao) {
        this._descricao = _descricao;
    }

    public abstract double calcularXp();
}
