package org.example.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Colaborador {
    private List<Negocio> negocios = new ArrayList<>();

    public void atribuir(String nomeNegocio, String nomePerda, String motivo) {
        Perda perda = PerdaFactory.getPerda(nomePerda, motivo);
        Negocio Negocio = new Negocio(nomeNegocio, perda);
        negocios.add(Negocio);
    }

    public List<String> obterNegocios() {
        List<String> saida = new ArrayList<String>();
        for (Negocio Negocio : this.negocios) {
            saida.add(Negocio.obterNegocio());
        }
        return saida;
    }
}
