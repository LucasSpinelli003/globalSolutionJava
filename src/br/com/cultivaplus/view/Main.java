package br.com.cultivaplus.view;

import br.com.cultivaplus.model.*;

public class Main {
    public static void main(String[] args) {
        Plano pl = new Plano();
        Basico bs = new Basico();
        Avancado av = new Avancado();
        Premium pr = new Premium();
        Cadastro cd = new Cadastro();
        Login ln = new Login();
        Pagamento pg = new Pagamento();


        cd.coletaDados();
        cd.confereDados();
        if (ln.verificaLogin(cd)) {
            System.out.println("Seja bem vindo a Cultiva+, venha fazer parte dessa missão de mudar o mundo também!!\n");
            System.out.println("Seed the Future\n");
            pl.exibePlanosDisponiveis(pr, av, bs);
            pl.assinaPlano(pg);
            pl.exibePlanoAtual();
            pl.alteraPlano();
            pl.calcelaPlano();
            pl.exibePlanoAtual();
        }else{

        }
    }
}