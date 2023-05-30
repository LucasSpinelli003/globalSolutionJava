package br.com.cultivaplus.model;
import br.com.cultivaplus.model.Cadastro;

import javax.swing.*;

public class Login {
    private String email;
    private String senha;
    private boolean validacao;

    public boolean verificaLogin(Cadastro cadastro){
        String email = JOptionPane.showInputDialog("Digite o seu email: ");
        String senha  = JOptionPane.showInputDialog("Digite a sua senha: ");
        int contador = 1;

        while (!senha.equals(cadastro.getSenha())|| !email.equals(cadastro.getEmail())){
            JOptionPane.showMessageDialog(null,"Senha ou usuario incorreto, tente novamente");
            JOptionPane.showMessageDialog(null, "Tentativas restantes: "+ (2 - contador));
            email = JOptionPane.showInputDialog("Digite o seu usuário: ");
            senha  = JOptionPane.showInputDialog("Digite a sua senha: ");
            contador++;
            break;


        }if(senha.equals(cadastro.getSenha())&& email.equals(cadastro.getEmail())) {
            JOptionPane.showMessageDialog(null,"Acesso liberado");
            return validacao = true;
        }else {
            JOptionPane.showMessageDialog(null,"Acesso Bloqueado, tente novamente mais tarde!");
            return validacao = false;
        }
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isValidacao() {
        return validacao;
    }


}
