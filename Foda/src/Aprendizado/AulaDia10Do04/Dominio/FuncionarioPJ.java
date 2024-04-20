package Aprendizado.AulaDia10Do04.Dominio;

public class FuncionarioPJ extends AbstraçaoFuncionario {

    protected  int quantiHoras;

    @Override
    public String getNome() {
        return nome;
    }

    public double SalarioMes(){

        return quantiHoras * salario;

    }

    public int getQuantiHoras() {
        return quantiHoras;
    }

    public void setQuantiHoras(int quantiHoras) {
        this.quantiHoras = quantiHoras;
    }

}
