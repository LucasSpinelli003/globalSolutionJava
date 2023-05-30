package br.com.cultivaplus.model;

import javax.swing.*;
import java.util.Scanner;

public class Pagamento {

    Scanner leitor = new Scanner(System.in);

    public void metodoPagamento(){
        String numeroCartao;
        String dataVencimento;
        String nomeTitular;
        String cvv;
        numeroCartao = JOptionPane.showInputDialog("Digite o número do cartão: ");
        dataVencimento = JOptionPane.showInputDialog("Digite a data de vencimento: ");
        nomeTitular = JOptionPane.showInputDialog("Digite o nome do titular: ");
        cvv = JOptionPane.showInputDialog("Digite o cvv do cartão: ");
    }
    public void metodoPagamento(String pix){
        System.out.println(pix);
    }

    public void pagamento(){
        System.out.println("Escolha o metodo de pagamento: ");
        System.out.println("1- Cartão");
        System.out.println("2- Pix");
        int pag = leitor.nextInt();
        while (pag<1||pag>2){
            System.out.println("Escolha o metodo de pagamento: ");
            System.out.println("1- Cartão");
            System.out.println("2- Pix");
            pag = leitor.nextInt();
        }if (pag == 1){
            metodoPagamento();
        }else {
            metodoPagamento("Chave pix: cultiva@plus.com");
        }


    }

}
