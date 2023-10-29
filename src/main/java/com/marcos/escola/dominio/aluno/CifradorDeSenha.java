package com.marcos.escola.dominio.aluno;

import java.security.NoSuchAlgorithmException;

public interface CifradorDeSenha {
    String cifrarSenha(String senha) throws NoSuchAlgorithmException;
    boolean valdiarSenhaCifrada(String senhaCifrada, String senha);
}
