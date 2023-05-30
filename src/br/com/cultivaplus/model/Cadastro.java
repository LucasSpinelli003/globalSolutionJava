package br.com.cultivaplus.model;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Cadastro {
    Scanner leitor = new Scanner(System.in);
    private String nomeCompleto,email,senha,cpf,telefone;

    public void coletaDados(){
        nomeCompleto = JOptionPane.showInputDialog("Digite o seu nome completo: ");
        email = JOptionPane.showInputDialog("Digite o seu email para cadastrar: ");
        senha = JOptionPane.showInputDialog("Digite uma senha para ser cadastrada: ");
        cpf = JOptionPane.showInputDialog("Digite o seu cpf: ");
        telefone = JOptionPane.showInputDialog("Digite o seu telefone: " + "ex: \"(XX)XXXXX-XXXX\")");
    }
    public void confereDados(){
         String confere = "S";
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);
        System.out.println("cpf: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Se os dados estiverem corretos digite: \"S\" ");
        confere = leitor.next().toUpperCase(Locale.ROOT);
        while (!confere.equals("S")){
            nomeCompleto = JOptionPane.showInputDialog("Digite o seu nome completo: ");
            email = JOptionPane.showInputDialog("Digite o seu email para cadastrar: ");
            senha = JOptionPane.showInputDialog("Digite uma senha para ser cadastrada: ");
            cpf = JOptionPane.showInputDialog("Digite o seu cpf: ");
            telefone = JOptionPane.showInputDialog("Digite o seu telefone: " + "ex: \"(XX)XXXXX-XXXX\")");
            System.out.println("\nNome completo: " + nomeCompleto);
            System.out.println("Email: " + email);
            System.out.println("Senha: " + senha);
            System.out.println("cpf: " + cpf);
            System.out.println("Telefone: " + telefone);
            System.out.println("Se os dados estiverem corretos digite: \"S\" ");
            confere = leitor.next().toUpperCase(Locale.ROOT);
        }if (confere.equals("S")){
            System.out.println("\nParabéns!!, seu cadastro foi efetuado com sucesso!\n");
        }
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}
