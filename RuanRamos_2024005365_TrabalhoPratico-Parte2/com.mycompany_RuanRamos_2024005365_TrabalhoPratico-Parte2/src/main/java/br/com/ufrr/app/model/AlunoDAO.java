package br.com.ufrr.app.model;

import java.util.List;

public class AlunoDAO {

    public void salvar(Aluno aluno) {
        BancoDeDados
            .getInstance()
            .getAlunos()
            .add(aluno);

        System.out.println("DAO: Aluno " + aluno.getNome() + " persistido.");
        System.out.println("Total de alunos: " +
            BancoDeDados.getInstance().getAlunos().size());
    }

    public List<Aluno> listarTodos() {
        return BancoDeDados.getInstance().getAlunos();
    }
}
