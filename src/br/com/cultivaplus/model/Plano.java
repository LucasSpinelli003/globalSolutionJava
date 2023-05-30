package br.com.cultivaplus.model;

import javax.swing.*;
import java.util.Scanner;

public class Plano {
    protected String nome;
    protected double valor;
    protected String beneficios;
    private String planoAtual = " ";

    Scanner leitor = new Scanner(System.in);

    public void exibePlanosDisponiveis(Premium premium, Avancado avancado, Basico basico){
        System.out.println("Nós temos os seguintes planos disponíveis: \n");
        premium.exibePlano();
        avancado.exibePlano();
        basico.exibePlano();

    }

    public void exibeBeneficios(){

    }

    public void assinaPlano (Pagamento pagamento) {

        System.out.println("Assinaturas: \n");
        System.out.println("1- Plano Básico");
        System.out.println("2- Plano Avançado");
        System.out.println("3- Plano Premium");
        System.out.println("4- Sair\n");


        int check = 1;
        while (check == 1) {
            System.out.println("Digite a opção desejada:");
            int opcao = leitor.nextInt();
            if (opcao > 4 || opcao < 1) {
                System.out.println("Opção invalida!");
            }
            switch (opcao) {
                case 1:
                    pagamento.pagamento();
                    System.out.println("\nPagamento confirmado.");
                    System.out.println("\nParabéns!!, você assinou o plano básico.");
                    planoAtual = "Plano Básico";
                    check = 2;
                    break;
                case 2:
                    pagamento.pagamento();
                    System.out.println("\nPagamento confirmado.");
                    System.out.println("\nParabéns!!, você assinou o plano avançado.");
                    planoAtual = "Plano Avançado";
                    check = 2;
                    break;
                case 3:
                    pagamento.pagamento();
                    System.out.println("\nPagamento confirmado.");
                    System.out.println("\nParabéns!!, você assinou o plano premium.");
                    planoAtual = "Plano Premium";
                    check = 2;
                    break;
                case 4:
                    check = 2;
                    break;
            }
            if (check != 2) {
                System.out.println("Assinaturas: \n");
                System.out.println("1- Plano Básico");
                System.out.println("2- Plano Avançado");
                System.out.println("3- Plano Premium");
                System.out.println("4- Sair\n");
            }
        }
    }

    public void exibePlanoAtual(){
        if(planoAtual.equals(" ")){
            System.out.println("\nNo momento você ainda não assinou nenhum plano.\n");
        }else
            System.out.println("\nPlano assinado no momento: " + planoAtual + "\n");
    }


    public void calcelaPlano(){
    if(planoAtual.equals(" ")){
        System.out.println("Você não possui nenhum plano para ser cancelado.");
    }else{
        System.out.println("Se você realmente deseja cancelar o plano, digite \"S\" ");
        String cancelando = leitor.next().toUpperCase();
        if (cancelando.equals("S")){
            System.out.println("Seu plano foi cancelado.");
            planoAtual = " ";
        }else {

            }
        }
    }

    public void alteraPlano(){
        int planoNovo;

        System.out.println("Para qual plano você deseja alterar");
        if(planoAtual.equals("Plano Básico")){
            System.out.println("1- Plano Avançado");
            System.out.println("2- Plano Premium");
            System.out.println("3- Sair");
            planoNovo = leitor.nextInt();
                if(planoNovo == 1){
                    System.out.println("Seu plano foi alterado para o plano Avançado");
                    planoAtual = "Plano Avançado";
                }else if(planoNovo == 2){
                    System.out.println("Seu plano foi alterado para o plano Premium");
                    planoAtual = "Plano Premium";
                }else{
                    System.out.println("O plano não foi alterado");
                }
        }else if(planoAtual.equals("Plano Avançado")){
            System.out.println("1- Plano Básico");
            System.out.println("2- Plano premium");
            System.out.println("3- Sair");
            planoNovo = leitor.nextInt();
            if(planoNovo == 1){
                System.out.println("Seu plano foi alterado para o plano Básico");
                planoAtual = "Plano Básico";
            }else if(planoNovo == 2){
                System.out.println("Seu plano foi alterado para o plano premium");
                planoAtual = "Plano Premium";
            }else{
                System.out.println("O plano não foi alterado");
            }
        }else{
            System.out.println("1- Plano Básico");
            System.out.println("2- Plano Avançado");
            System.out.println("3- Sair");
            planoNovo = leitor.nextInt();
            if(planoNovo == 1){
                System.out.println("Seu plano foi alterado para o plano Básico");
                planoAtual = "Plano Básico";
            }else if(planoNovo == 2){
                System.out.println("Seu plano foi alterado para o plano Avançado");
                planoAtual = "Plano Avançado";
            }else{
                System.out.println("O plano não foi alterado");
            }
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public void setPlanoAtual(String planoAtual) {
        this.planoAtual = planoAtual;
    }

    public Scanner getLeitor() {
        return leitor;
    }

    public void setLeitor(Scanner leitor) {
        this.leitor = leitor;
    }

    public String getPlanoAtual() {
        return planoAtual;
    }

    public String getNome() {
        return nome;
    }
}

