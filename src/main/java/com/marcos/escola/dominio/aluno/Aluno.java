package com.marcos.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aluno {

    private CPF cpf;
    private String nome;
    private Email email;

    private String senha;

    private List<Telefone> telefones = new ArrayList<>();

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero) throws IllegalArgumentException {
        try {
            telefones.add(new Telefone(ddd, numero));
        } catch (IllegalArgumentException ex) {
            throw ex;
        }
    }

    public void adicionarTelefone(Telefone telefone) {
        telefones.add(telefone);
    }

    public String getCpf() {
        return cpf.getNumero();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email.getEndereco();
    }

    public List<Telefone> getTelefones() {
        return Collections.unmodifiableList(this.telefones);
    }
}
