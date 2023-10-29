package com.marcos.escola.aluno;

import com.marcos.escola.dominio.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefoneComNumerosInvalidos() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Telefone(null, null)
        );

        assertThrows(
                IllegalArgumentException.class,
                () -> new Telefone("", "")
        );

        assertThrows(
                IllegalArgumentException.class,
                () -> new Telefone("1", "1234")
        );
    }
}
