package Aprendizado.Aula2;
import java.util.Scanner;

public class TesteInputScanners {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        String nome;
        System.out.println("digita um numero"); // esse texto sempre tem que ser antes do next.

        numero = scan.nextInt();
        nome = scan.nextLine();

        System.out.println(" o seu numero é "+ numero);



    }
}
