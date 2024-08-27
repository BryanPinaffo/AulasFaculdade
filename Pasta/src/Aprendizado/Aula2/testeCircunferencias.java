package Aprendizado.Aula2;
import java.util.Scanner;
public class testeCircunferencias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        circuferencias circo = new circuferencias();

        System.out.println("Qual a area? ");

        circo.area = scan.nextDouble();

        System.out.println("qual o seu raio");

        circo.raio = scan.nextDouble();

        System.out.println("entre com o valor do percentual de aumento de raio: ");

        circo.perc = scan.nextDouble();

        circo.visualizarValores();


    }
}
