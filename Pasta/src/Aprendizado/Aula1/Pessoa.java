package Aprendizado.Aula1;

public class Pessoa {

        int idade;
        double peso;
        double altura;
        String nome;

        public void Mostrar(){ // metodo é uma açao ( no caso o metodo é (mostrar))

                System.out.println("Nome: " + nome);
                System.out.println("Altura: " + altura);
                System.out.println("Idade: " + idade);
                System.out.println("Peso: " + peso);
                System.out.println("Seu IMC é: "+Calculo());
                System.out.println(" ");
        }

        public double Calculo() {

             return  peso / (altura*altura); // retornar apenas o valor



        }

}
