package br.com.ufrr.app.model;

import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    private static List<Aluno> tabelaAlunos = new ArrayList<>();

    public void salvar(Aluno aluno) {
        tabelaAlunos.add(aluno);
        System.out.println("DAO: Aluno " + aluno.getNome() + " persistido com sucesso!");
    }
}
