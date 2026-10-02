package com.fatec;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class IsNumeroParTest {

    private final Calculadora calculadora = new Calculadora();

    @ParameterizedTest(name = "{0} deve ser par")
    @CsvSource({
        "0, true",
        "2, true",
        "100, true",
        "-4, true",
        "1, false",
        "7, false",
        "-3, false"
    })
    void deveIdentificarNumerosParesEImpares(int numero, boolean esperado) {
        boolean resultado = calculadora.isNumeroPar(numero);

        if (esperado) {
            assertTrue(resultado);
        } else {
            assertFalse(resultado);
        }
    }
}
