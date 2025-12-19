package br.com.ufrr.app.model;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {

    // 1. Instância única (atributo estático)
    private static BancoDeDados instance;

    // 2. Estrutura que simula o banco
    private List<Aluno> alunos;

    // 3. Construtor PRIVADO (regra obrigatória do Singleton)
    private BancoDeDados() {
        alunos = new ArrayList<>();
    }

    // 4. Ponto global de acesso à instância
    public static BancoDeDados getInstance() {
        if (instance == null) {
            instance = new BancoDeDados();
        }
        return instance;
    }

    // 5. Getter da lista
    public List<Aluno> getAlunos() {
        return alunos;
    }
}
