package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate _data;

    public Mentoria() {
    }

    public LocalDate get_data() {
        return _data;
    }

    public void set_data(LocalDate _data) {
        this._data = _data;
    }


    @Override
    public String toString() {
        return "Mentoria{" +
                "_titulo='" + get_titulo() + '\'' +
                ", _descricao='" + get_descricao() + '\'' +
                ", _data=" + _data +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
