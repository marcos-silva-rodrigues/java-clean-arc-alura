package com.marcos.escola.aluno;

import com.marcos.escola.dominio.aluno.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmailTest {

    @Test
    void naoDeveriaCriarEmailComEnderecosInvalidos() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Email(null)
        );

        assertThrows(
                IllegalArgumentException.class,
                () -> new Email("")
        );

        assertThrows(
                IllegalArgumentException.class,
                () -> new Email("emailInvalido")
        );
    }
}
