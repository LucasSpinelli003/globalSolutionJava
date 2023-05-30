package br.com.cultivaplus.model;

public class Basico extends Plano {

    public void exibePlano(){
        System.out.println(nome = "Plano básico: ");
        System.out.println(valor = 29.90);
        exibeBeneficios();
    }
    @Override
    public void exibeBeneficios(){
        beneficios = "Você recebe 10% de desconto nos serviços dos nossos parceiros.";
        System.out.println(beneficios);
    }

}

