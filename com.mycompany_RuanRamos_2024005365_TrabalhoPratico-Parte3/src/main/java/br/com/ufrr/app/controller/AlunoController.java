package br.com.ufrr.app.controller;

import br.com.ufrr.app.model.Aluno;
import br.com.ufrr.app.model.AlunoDAO;
import br.com.ufrr.app.view.TelaAluno;
import java.util.List;

public class AlunoController {

    private TelaAluno view;
    private AlunoDAO alunoDAO;

    public AlunoController(TelaAluno view) {
        this.view = view;
        this.alunoDAO = new AlunoDAO();
    }

    public void salvarAluno(String nome, String cpf) {

        if (nome.trim().isEmpty() || cpf.trim().isEmpty()) {
            view.exibirMensagem("Preencha todos os campos!");
            return;
        }

        Aluno aluno = new Aluno(nome, cpf);

        if (!aluno.validarCPF()) {
            view.exibirMensagem("CPF inválido! Deve conter 11 dígitos.");
            return;
        }

        alunoDAO.salvar(aluno);

        view.exibirMensagem("Aluno salvo com sucesso!");
        view.limparFormulario();
    }

    public void listarAlunos() {

        List<Aluno> alunos = alunoDAO.listarTodos();

        if (alunos.isEmpty()) {
            view.exibirMensagem("Nenhum aluno cadastrado.");
            return;
        }

        StringBuilder sb = new StringBuilder("Alunos cadastrados:\n");

        for (Aluno aluno : alunos) {
            sb.append(aluno.getNome()).append("\n");
        }

        view.exibirMensagem(sb.toString());
    }
}

