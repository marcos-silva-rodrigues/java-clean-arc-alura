package com.marcos;

import com.marcos.escola.application.aluno.matricular.MatricularAluno;
import com.marcos.escola.application.aluno.matricular.MatricularAlunoDto;
import com.marcos.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        MatricularAlunoDto dados = new MatricularAlunoDto(
                "Fulano da Silva",
                "123.456.123-12",
                "fulano@gmail.com"
        );
        MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        matricular.executar(dados);

    }
}