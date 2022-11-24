package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private int _cargaHoraria;

    public Curso() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * _cargaHoraria;
    }

    public int get_cargaHoraria() {
        return _cargaHoraria;
    }

    public void set_cargaHoraria(int _cargaHoraria) {
        this._cargaHoraria = _cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "_titulo='" + get_titulo() + '\'' +
                ", _descricao='" + get_descricao() + '\'' +
                ", _cargaHoraria=" + _cargaHoraria +
                '}';
    }
}
