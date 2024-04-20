package Aprendizado.AulaDia10Do04EuFazendo.Teste;

import Aprendizado.AulaDia10Do04EuFazendo.Dominio.ContaInvestimento;
import Aprendizado.AulaDia10Do04EuFazendo.Dominio.Conta_Poupança;

public class ContaTeste {
    public static void main(String[] args) {

        ContaInvestimento continvet = new ContaInvestimento();
        continvet.setImposto(true);
        continvet.setSaldo(100);
        continvet.CalcularImposto();

        System.out.println("------------Investimento--------------");
        System.out.println("numero da conta é: " + continvet.getNumConta());
        System.out.println("seu saldo é: " + continvet.getSaldo());

        Conta_Poupança contipoup = new Conta_Poupança();

        contipoup.setVencimentos(true);
        contipoup.setSaldo(100);
        contipoup.CalcularRendimento();

        System.out.println("------------Poupanca--------------");
        System.out.println("numero da conta é: " + contipoup.getNumConta());
        System.out.println("seu rendimentoé: " + contipoup.getSaldo());


    }


}
