package Aprendizado.AulaDia10Do04EuFazendo.Dominio;

public class Conta_Poupança extends Conta{
    protected boolean vencimentos;

    @Override
    public int getNumConta() {
        return 345;
    }

    public void CalcularRendimento(){

        if(vencimentos == true) {
            saldo = saldo + (5.0/100.0);
        }

    }

    public boolean getIsVencimentos() {
        return vencimentos;
    }

    public void setVencimentos(boolean vencimentos) {
        this.vencimentos = vencimentos;
    }
}
