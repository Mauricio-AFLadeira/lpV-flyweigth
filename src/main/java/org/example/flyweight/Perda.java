package org.example.flyweight;

public class Perda {
    private String nome;
    private String motivo;

    public Perda(String nome, String motivo) {
        this.nome = nome;
        this.motivo = motivo;
    }

    public String getNome() {
        return nome;
    }

    public String getMotivo() {
        return motivo;
    }
}
