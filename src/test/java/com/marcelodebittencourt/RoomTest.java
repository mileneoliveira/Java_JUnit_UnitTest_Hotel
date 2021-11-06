package com.marcelodebittencourt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoomTest {

    @Test
    //teste Novo quarto
    void testNewRoom(){
        //E - Entrada de dados - massa
        int numeroDoQuarto = 200;
        String nomeDoQuarto = "Suíte Luxo";
        double valorDiario = 500;

        //T - Teste - Execução do teste
        Room quartoLuxo = new Room(numeroDoQuarto,nomeDoQuarto,valorDiario);

        //R - Resultado - Validação de Resultador
        assertEquals(numeroDoQuarto, quartoLuxo.getId());
        assertEquals(nomeDoQuarto, quartoLuxo.getName());
        assertEquals(valorDiario, quartoLuxo.getPricePerDay());
    }
    
}
