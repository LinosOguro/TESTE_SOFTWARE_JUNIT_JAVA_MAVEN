package com.fatec;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FalhaDemonstracaoTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    void deveDemonstrarFalhaQuandoResultadoNaoCorrespondeAoEsperado() {
        assertEquals(90, calculadora.calcularDesconto(100, 0));
    }
}
