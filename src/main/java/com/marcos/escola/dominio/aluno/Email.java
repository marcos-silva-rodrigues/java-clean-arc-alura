package com.marcos.escola.dominio.aluno;

public class Email  {
    private final String EMAIL_REGEX = "^[a-zA-Z0-9._]+@[a-zA-Z0-9._]+\\.[a-zA-Z]{2,}$";
    private String endereco;

    public Email(String endereco) {
        if (!this.isValid(endereco))
            throw new IllegalArgumentException("E-mail");
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    private boolean isValid(String endereco) {
        return endereco != null && endereco.matches(EMAIL_REGEX);
    }


}
