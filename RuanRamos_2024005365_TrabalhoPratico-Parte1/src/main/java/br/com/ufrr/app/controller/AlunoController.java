package br.com.ufrr.app.controller;

import br.com.ufrr.app.model.Aluno;
import br.com.ufrr.app.model.AlunoDAO;
import br.com.ufrr.app.view.TelaAluno;

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
            view.exibirMensagem("CPF inválido!");
            return;
        }

        alunoDAO.salvar(aluno);

        view.exibirMensagem("Salvo com sucesso!");
        view.limparFormulario();
    }
}
