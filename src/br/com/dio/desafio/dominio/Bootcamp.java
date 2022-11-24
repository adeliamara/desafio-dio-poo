package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp{
    private String _nome;
    private String _descricao;
    private LocalDate _dataInicial = LocalDate.now();
    private  LocalDate _dataFinal = _dataInicial.plusDays(45);
    private Set<Dev> _devsIncritos = new HashSet<>();//a ordem aqui nao importa
    private Set<Conteudo> _conteudos = new LinkedHashSet<>();

    public String get_nome() {
        return _nome;
    }

    public void set_nome(String _nome) {
        this._nome = _nome;
    }

    public String get_descricao() {
        return _descricao;
    }

    public void set_descricao(String _descricao) {
        this._descricao = _descricao;
    }

    public LocalDate get_dataInicial() {
        return _dataInicial;
    }

    public void set_dataInicial(LocalDate _dataInicial) {
        this._dataInicial = _dataInicial;
    }

    public LocalDate get_dataFinal() {
        return _dataFinal;
    }

    public void set_dataFinal(LocalDate _dataFinal) {
        this._dataFinal = _dataFinal;
    }

    public Set<Dev> get_devsIncritos() {
        return _devsIncritos;
    }

    public void set_devsIncritos(Set<Dev> _devsIncritos) {
        this._devsIncritos = _devsIncritos;
    }

    public Set<Conteudo> get_conteudos() {
        return _conteudos;
    }

    public void set_conteudos(Set<Conteudo> _conteudos) {
        this._conteudos = _conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(_nome, bootcamp._nome) && Objects.equals(_descricao, bootcamp._descricao) && Objects.equals(_dataInicial, bootcamp._dataInicial) && Objects.equals(_dataFinal, bootcamp._dataFinal) && Objects.equals(_devsIncritos, bootcamp._devsIncritos) && Objects.equals(_conteudos, bootcamp._conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_nome, _descricao, _dataInicial, _dataFinal, _devsIncritos, _conteudos);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
