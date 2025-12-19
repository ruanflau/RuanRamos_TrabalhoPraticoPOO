package br.com.ufrr.app.model;

import java.util.List;

public class AlunoDAO {

    public void salvar(Aluno aluno) {
        BancoDeDados
            .getInstance()
            .getAlunos()
            .add(aluno);

        System.out.println("DAO: Aluno " + aluno.getNome() + " persistido.");
    }

    public List<Aluno> listarTodos() {
        return BancoDeDados.getInstance().getAlunos();
    }
}
