package Aprendizado.AulaDia10Do04EuFazendo.Dominio;

public class ContaInvestimento extends Conta {

    protected boolean imposto;
    @Override
    public int getNumConta() {
        return 143;
    }

    public void CalcularImposto(){

        if(imposto == true){

            double porcentagem;

            saldo = saldo * (30.0/100.0);

        }

    }

    public boolean getIsImposto() {
        return imposto;
    }

    public void setImposto(boolean imposto) {
        this.imposto = imposto;
    }
}
