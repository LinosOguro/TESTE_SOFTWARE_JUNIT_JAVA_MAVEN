package com.fatec;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalcularDescontoErroTest {

    private final Calculadora calculadora = new Calculadora();

    @ParameterizedTest(name = "O desconto de {0}% deve ser rejeitado")
    @ValueSource(ints = {-1, 101})
    void deveRejeitarPercentualDeDescontoForaDoIntervalo(int percentualDesconto) {
        IllegalArgumentException excecao = assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.calcularDesconto(100, percentualDesconto));

        assertEquals("Desconto inválido", excecao.getMessage());
    }
}
