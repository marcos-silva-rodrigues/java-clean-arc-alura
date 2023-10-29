package com.marcos.escola.dominio.aluno;

public class CPF {
    private final String CPF_REGEX = "^[0-9]{3}\\.[0-9.]{3}\\.[0-9]{3}-[0-9]{2}$";
    private String numero;

    public CPF(String numero) {
        if (!this.isValid(numero))
            throw new IllegalArgumentException("CPF");
        this.numero = numero;
    }

    public String getNumero() {
        return this.numero;
    }

    private boolean isValid(String numero) {
        return numero != null && numero.matches(CPF_REGEX);
    }

}
