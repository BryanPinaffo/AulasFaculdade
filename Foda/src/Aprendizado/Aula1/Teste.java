package Aprendizado.Aula1;

import Aprendizado.Aula1.Pessoa;

public class Teste {

    public static void main(String[] args) { // é a entrada do java, so tem um por projeto

        int numero = 1;

            Pessoa obj1 = new Pessoa(); // classe e objeto (objeto é quando a classe se torna algo na sua memoria(algo fixo))
            obj1.nome = "Eu";
            obj1.altura = 1.76;
            obj1.idade = 20;
            obj1.peso = 80;
            obj1.Mostrar();


            Pessoa obj2 = new Pessoa(); // pode ser criado varios objetos ( uma casa pode conter varias plantas ( uma classe pode conter varios objetos))
            obj2.nome = "Igor";
            obj2.altura = 1.75;
            obj2.idade = 19;
            obj2.peso = 80;
            obj2.Mostrar();

            System.out.println(numero);
        System.out.println();




        for ( int a= 0 ; a < 5; a++){

            System.out.println("LPOO"+ a);
        }



        }
    }
