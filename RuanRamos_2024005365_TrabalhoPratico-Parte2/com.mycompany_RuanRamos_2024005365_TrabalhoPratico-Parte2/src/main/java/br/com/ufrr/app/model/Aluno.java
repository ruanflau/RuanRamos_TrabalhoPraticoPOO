package br.com.ufrr.app.model;

public class Aluno {

    private Long id;
    private String nome;
    private String cpf;
    private String matricula;

    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public boolean validarCPF() {
        return cpf.length() == 11;
    }
}
