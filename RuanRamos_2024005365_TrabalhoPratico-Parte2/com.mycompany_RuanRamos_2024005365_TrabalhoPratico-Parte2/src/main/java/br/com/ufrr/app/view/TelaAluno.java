package br.com.ufrr.app.view;

import br.com.ufrr.app.controller.AlunoController;
import javax.swing.*;
import java.awt.*;

public class TelaAluno extends JFrame {

    private JTextField txtNome;
    private JTextField txtCPF;
    private JButton btnSalvar;
    private AlunoController controller;

    public TelaAluno() {
        super("Cadastro de Aluno");

        inicializarComponentes();

        controller = new AlunoController(this);

        configurarEventos();

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void inicializarComponentes() {
        setLayout(new FlowLayout());

        txtNome = new JTextField(20);
        txtCPF = new JTextField(11);
        btnSalvar = new JButton("Salvar");

        add(new JLabel("Nome:"));
        add(txtNome);

        add(new JLabel("CPF:"));
        add(txtCPF);

        add(btnSalvar);
    }

    private void configurarEventos() {
        btnSalvar.addActionListener(e ->
            controller.salvarAluno(
                txtNome.getText(),
                txtCPF.getText()
            )
        );
    }

    public void exibirMensagem(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    public void limparFormulario() {
        txtNome.setText("");
        txtCPF.setText("");
        txtNome.requestFocus();
    }
}
