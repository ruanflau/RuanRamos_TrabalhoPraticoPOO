# RuanRamos_TrabalhoPraticoPOO

Trabalho prático da disciplina **Programação Orientada a Objetos (DCC305)**, desenvolvido como parte da avaliação sobre **Arquitetura de Software e Padrões de Projeto**, ministrada pelo Prof. Jean Bertrand na **Universidade Federal de Roraima (UFRR)**.

O projeto tem como objetivo refatorar um protótipo funcional, aplicando o padrão arquitetural **MVC (Model–View–Controller)** de forma rigorosa e incorporando o padrão de projeto **Singleton**, garantindo organização, manutenibilidade e evolução segura do sistema.

## Objetivos do Trabalho

- Aplicar corretamente a arquitetura MVC  
- Separar responsabilidades entre View, Controller e Model  
- Implementar o padrão Singleton para controle de instância única  
- Evoluir o sistema com nova funcionalidade sem quebrar o código existente  
- Modelar a solução final utilizando UML  

## Arquitetura do Projeto

O projeto foi estruturado seguindo rigorosamente o padrão MVC, com a seguinte organização de pacotes:

br.com.ufrr.app
├── model
│ ├── Aluno.java
│ ├── AlunoDAO.java
│ └── BancoDeDados.java
├── controller
│ └── AlunoController.java
├── view
│ └── TelaAluno.java
└── Main.java


### Responsabilidades das Camadas

- **View**: Interface gráfica com o usuário (Swing), responsável apenas por eventos e exibição de mensagens, sem acesso direto ao Model.  
- **Controller**: Intermedia a comunicação entre View e Model, concentrando as regras de fluxo e validações.  
- **Model**: Contém as entidades do sistema e a lógica de persistência em memória, incluindo a implementação do padrão Singleton.  

## Padrões de Projeto Utilizados

O padrão **Singleton** foi aplicado na classe `BancoDeDados`, garantindo que exista apenas uma única instância responsável por armazenar os dados em memória durante a execução do sistema. A implementação utiliza construtor privado, instância estática única e método de acesso global controlado (`getInstance()`).

## Funcionalidades Implementadas

- Cadastro de alunos com validação de CPF  
- Persistência em memória utilizando Singleton  
- Listagem de alunos cadastrados por meio da interface gráfica  
- Interface gráfica desenvolvida com Java Swing  

## Diagrama UML

![Image Alt](https://raw.githubusercontent.com/ruanflau/RuanRamos_TrabalhoPraticoPOO/refs/heads/main/DiagramaUML.png)
## Execução do Projeto

1. Abrir o projeto em uma IDE Java (NetBeans, IntelliJ ou Eclipse)  
2. Compilar o projeto  
3. Executar a classe `Main`  
4. Utilizar a interface gráfica para cadastrar e listar alunos  

## Tecnologias Utilizadas

- Java  
- Java Swing  
- UML  
- Padrões de Projeto (GoF)  

## Considerações Finais

Este projeto demonstra a aplicação prática dos conceitos de Programação Orientada a Objetos, Arquitetura de Software e Padrões de Projeto, evidenciando a importância da separação de responsabilidades e da organização do código para facilitar manutenção e evolução do sistema.

## Autor

**Ruan Felipe Lauriano Ramos**  
Curso de Ciência da Computação  
Universidade Federal de Roraima – UFRR
