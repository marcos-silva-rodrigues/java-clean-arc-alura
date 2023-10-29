package com.marcos.escola.application.aluno.matricular;

import com.marcos.escola.dominio.aluno.Aluno;
import com.marcos.escola.dominio.aluno.FabricaDeAluno;
import com.marcos.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorioDeAlunos;

    public MatricularAluno(RepositorioDeAlunos repositorioDeAlunos) {
        this.repositorioDeAlunos = repositorioDeAlunos;
    }

    public void executar(MatricularAlunoDto dto) {
        Aluno aluno = new FabricaDeAluno()
                .comNomeCpfEmail(
                        dto.getCpf(),
                        dto.getNome(),
                        dto.getEmail()
                )
                .criar();

        repositorioDeAlunos.matricular(aluno);
    }
}
