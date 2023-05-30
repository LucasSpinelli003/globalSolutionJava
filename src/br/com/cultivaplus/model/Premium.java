package br.com.cultivaplus.model;

public class Premium extends Plano {

    public void exibePlano(){
        System.out.println(nome = "Plano premium: ");
        System.out.println(valor = 49.90);
        exibeBeneficios();
    }
    @Override
    public void exibeBeneficios(){
        beneficios ="A cada trimestre você recebe produtos " +
                    "dos nossos parceiros além de também possuir 10% de desconto em seus serviços,\n e por fim, ao assinar você recebe 5% de cashback .";
        System.out.println(beneficios);
    }

}
