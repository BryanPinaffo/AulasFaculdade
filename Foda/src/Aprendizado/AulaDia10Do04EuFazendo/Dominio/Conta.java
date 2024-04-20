package Aprendizado.AulaDia10Do04EuFazendo.Dominio;

public abstract class Conta {

    protected double saldo;
    protected int numConta;

    public abstract int getNumConta();

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
}
