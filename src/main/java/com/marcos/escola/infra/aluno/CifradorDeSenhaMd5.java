package com.marcos.escola.infra.aluno;

import com.marcos.escola.dominio.aluno.CifradorDeSenha;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CifradorDeSenhaMd5 implements CifradorDeSenha {
    @Override
    public String cifrarSenha(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(senha.getBytes());
            byte[] bytes = md.digest();
            StringBuffer sb = new StringBuffer();
            for (byte b : bytes)
                sb.append(String.format("%02x", b & 0xff));
            return sb.toString();
        } catch( NoSuchAlgorithmException ex) {
            throw new RuntimeException("erro ao gerar hash");
        }

    }

    @Override
    public boolean valdiarSenhaCifrada(String senhaCifrada, String senha) {
        return senhaCifrada.equals(cifrarSenha(senha));
    }
}
