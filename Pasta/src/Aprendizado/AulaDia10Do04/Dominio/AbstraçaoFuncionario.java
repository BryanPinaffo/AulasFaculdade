package Aprendizado.AulaDia10Do04.Dominio;

abstract public class AbstraçaoFuncionario { // vc tem uma classe que nao pode ser instanciada e ela vira uma classe modelo
    // ela é usada em metodo e classe

     protected String nome;
     protected double salario;

    public double BonusSalario(){

        return this.salario *1.2;

    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String  getNome(); // esta falando que as classes filhas precisam colocar um nome e criar um get

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }



}
