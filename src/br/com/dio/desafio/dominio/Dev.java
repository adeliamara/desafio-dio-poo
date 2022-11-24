package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String _nome;
    private Set<Conteudo> _conteudosInscritos = new LinkedHashSet<>(); //linkedhashset pois a ordem importa
    private Set<Conteudo> _conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this._conteudosInscritos.addAll(bootcamp.get_conteudos());
        bootcamp.get_devsIncritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this._conteudosInscritos.stream().findFirst();

        if(conteudo.isPresent()){
            this._conteudosConcluidos.add(conteudo.get());
            this._conteudosInscritos.remove((conteudo.get()));
        }else{
            System.err.println("Voce nao esta matriculado em nenhum conteudo!");
        }

    }

    public double calcularTotalXp() {
        return this._conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    public String get_nome() {
        return _nome;
    }

    public void set_nome(String _nome) {
        this._nome = _nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return _conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this._conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> get_conteudosConcluidos() {
        return _conteudosConcluidos;
    }

    public void set_conteudosConcluidos(Set<Conteudo> _conteudosConcluidos) {
        this._conteudosConcluidos = _conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(_nome, dev._nome) && Objects.equals(_conteudosInscritos, dev._conteudosInscritos) && Objects.equals(_conteudosConcluidos, dev._conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_nome, _conteudosInscritos, _conteudosConcluidos);
    }
}
