package org.example.flyweight;

public class Negocio {
    private String nome;
    private Perda perda;

    public Negocio(String nome, Perda perda) {
        this.nome = nome;
        this.perda = perda;
    }

    public String obterNegocio() {
        return "Negocio{" +
                "negocio='" + this.nome + '\'' +
                ", perda='" + perda.getNome() + '\'' +
                ", motivo='" + perda.getMotivo() + '\'' +
                '}';
    }
}
