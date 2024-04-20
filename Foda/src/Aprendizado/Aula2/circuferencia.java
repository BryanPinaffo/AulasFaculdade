package Aprendizado.Aula2;

public class circuferencia {
    public double area;
    public double raio;

    public double calculo;

    public double valor;

    public double perc;

    public double perimetro;


    public double calcularArea(){

        calculo = 3.14 * (raio * area);
        return calculo;

    }

    public double CalcularRaio(){

        valor = (perc / 100) +1;
        raio = raio * valor;
        return raio;

    }

    public double CalcularPerimetro(){

        perimetro = 2 * (3.14 * raio);

        return perimetro;

    }

    public void VisualizarValores(){

        System.out.println("sua area é "+area +'\n'+"e seu raio é "+raio+'\n' );

        System.out.println("resultado do calculo é "+ calcularArea());

        System.out.println("resultado do calculo do raio  aumentado é "+ CalcularRaio());

        System.out.println("seu perimetro é " + CalcularPerimetro());


    }
}
