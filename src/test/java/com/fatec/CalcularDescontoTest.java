package com.fatec;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcularDescontoTest {

    private final Calculadora calculadora = new Calculadora();

    @ParameterizedTest(name = "Total {0} com desconto de {1}% deve resultar em {2}")
    @CsvSource({
        "100, 0, 100",
        "100, 1, 99",
        "100, 50, 50",
        "100, 100, 0",
        "50, 1, 50"
    })
    void deveCalcularDescontoParaPercentuaisValidos(
            int valorTotal, int percentualDesconto, int resultadoEsperado) {
        assertEquals(
                resultadoEsperado,
                calculadora.calcularDesconto(valorTotal, percentualDesconto));
    }
}
