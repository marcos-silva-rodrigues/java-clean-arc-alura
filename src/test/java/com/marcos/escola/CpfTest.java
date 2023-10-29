package com.marcos.escola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CpfTest {

    @Test
    void naoDeveriaCriarCpfComnumerosInvalidos() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new CPF(null)
        );

        assertThrows(
                IllegalArgumentException.class,
                () -> new CPF("")
        );

        assertThrows(
                IllegalArgumentException.class,
                () -> new CPF("12345678901")
        );
    }
}
