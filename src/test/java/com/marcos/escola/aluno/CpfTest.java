package com.marcos.escola.aluno;

import com.marcos.escola.dominio.aluno.CPF;
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
