package Aprendizado.AulaDia10Do04.Teste;


import Aprendizado.AulaDia10Do04.Dominio.FuncionarioCLT;
import Aprendizado.AulaDia10Do04.Dominio.FuncionarioPJ;

abstract public class Teste {

    public static void main(String[] args) {

        FuncionarioCLT objclt = new FuncionarioCLT();

        objclt.setFeriado(true);
        objclt.setFimDeSemana(false);
        objclt.setHorasExtras(10);
        objclt.setNome("roberto");
        objclt.setSalario(2100);

        System.out.println("-----------CLT------------");

        System.out.println("o nome é: " + objclt.getNome());
        System.out.println("o salario é : " + objclt.getSalario());
        objclt.CalcularHoraExtra();
        System.out.println("o salario com extra: " + objclt.getSalario());
        System.out.println("o salario com bonus: " + objclt.BonusSalario());

        FuncionarioPJ objpj = new FuncionarioPJ();
        objpj.setNome("Maria");
        objpj.setSalario(70);
        objpj.setQuantiHoras(160);

        System.out.println("-----------PJ------------");
        System.out.println("o nome é: "+ objpj.getNome());
        System.out.println("o salario é: " + objpj.SalarioMes());



    }
}
