package org.example.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ColaboradorTest {
    @Test
    void deveRetornarNegocios() {
        Colaborador colaborador = new Colaborador();
        colaborador.atribuir("Arquitetura da planta", "Insatisfeito", "cliente ficou insatisfeito com o resultado apresentado");
        colaborador.atribuir("Design do interior", "Insatisfeito", "cliente ficou insatisfeito com o resultado apresentado");
        colaborador.atribuir("Modelo 3D", "Atraso", "não entregou no prazo determinado");

        List<String> saida = Arrays.asList(
                "Negocio{negocio='Arquitetura da planta', perda='Insatisfeito', motivo='cliente ficou insatisfeito com o resultado apresentado'}",
                "Negocio{negocio='Design do interior', perda='Insatisfeito', motivo='cliente ficou insatisfeito com o resultado apresentado'}",
                "Negocio{negocio='Modelo 3D', perda='Atraso', motivo='não entregou no prazo determinado'}");

        assertEquals(saida, colaborador.obterNegocios());
    }
    
}