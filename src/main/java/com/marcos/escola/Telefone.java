package com.marcos.escola;

public class Telefone {
    private String ddd;
    private String numero;

    Telefone(String ddd, String numero) {
        if (!isValid(ddd, numero)) throw new IllegalArgumentException("Telefone");
        this.ddd = ddd;
        this.numero = numero;
    }

    private boolean isValid(String ddd, String numero) {
        if (ddd == null || numero == null) return false;
        if (ddd.length() != 2) return false;
        if (numero.length() != 8) return false;

        return true;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }


}
