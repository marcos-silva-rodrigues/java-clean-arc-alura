package com.marcos.escola.application.indicacao;

import com.marcos.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarPara(Aluno indicado);
}
