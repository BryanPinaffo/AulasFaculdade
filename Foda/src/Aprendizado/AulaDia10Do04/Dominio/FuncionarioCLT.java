package Aprendizado.AulaDia10Do04.Dominio;

public class FuncionarioCLT extends AbstraçaoFuncionario{

    protected int horasExtras;
    protected double salarioExtra;
    protected boolean isFeriado;
    protected boolean isFimDeSemana;


    @Override
    public String getNome() {
        return nome;
    }


    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getSalarioExtra() {
        return salarioExtra;
    }

    public void setSalarioExtra(double salarioExtra) {
        this.salarioExtra = salarioExtra;
    }

    public boolean isFeriado() {
        return isFeriado;
    }

    public void setFeriado(boolean feriado) {
        isFeriado = feriado;
    }

    public boolean isFimDeSemana() {
        return isFimDeSemana;
    }

    public void setFimDeSemana(boolean fimDeSemana) {
        isFimDeSemana = fimDeSemana;
    }

    public void CalcularHoraExtra(){
        double fatorMultiplicador = 0;
        double valor = 0;

        if (isFimDeSemana == true){

            fatorMultiplicador = 1.3;

        } else if (isFeriado == true) {

            fatorMultiplicador = 1.5;

        }

        else {

            fatorMultiplicador = 1.1;
        }



        valor = salario /160;

        salarioExtra = salario * horasExtras;

        salarioExtra = salarioExtra* fatorMultiplicador;
        salario =+ salarioExtra;



    }


}
