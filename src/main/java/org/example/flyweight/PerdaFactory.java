package org.example.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PerdaFactory {
    private static Map<String, Perda> perdas = new HashMap<>();

    public static Perda getPerda(String nome, String motivo) {
        Perda perda = perdas.get(nome);
        if (perda == null) {
            perda = new Perda(nome, motivo);
            perdas.put(nome, perda);
        }
        return perda;
    }
}
