package br.com.cultivaplus.model;

public class Avancado extends Plano {
    public void exibePlano(){
        System.out.println(nome = "Plano avançado: ");
        System.out.println(valor = 39.90);
        exibeBeneficios();
    }
    @Override
    public void exibeBeneficios(){
        beneficios = "Você recebe 10% de desconto nos serviços dos nossos parceiros," +
            " além de receber  5% de cashback assinando o plano.";
        System.out.println(beneficios);
    }
}
