package FaculdadeTerceiroSemestre.AulaDia20Mes8.Dominio;

//import java.awt.*;

//import java.awt.*; // usado com o Frame, usa o java para fazer a interface

import javax.swing.*;


public class Part1 extends JFrame {
    public Part1() {

        //  Frame janela = new Frame("A palavra"); // vai dar uma janela
        JLabel rotulo = new JLabel("Nome: "); // aparece um texto
        JLabel rotulo2 = new JLabel("Senha: ");
        JButton botao = new JButton("Entrar"); //um botao
        JButton botao2 = new JButton("Cancelar");
        JTextField campo = new JTextField(); // um lugar para vc colocar o texto
        JTextField campo2 = new JTextField();


        rotulo.setBounds(50, 50, 60, 20); // posicionamento de x, posicionamento de y, largura e altura.
        rotulo2.setBounds(50, 100, 60, 20);
        campo.setBounds(110, 50, 180, 20);
        campo2.setBounds(110, 100, 180, 20);
        botao.setBounds(50, 150, 100, 20);
        botao2.setBounds(250, 150, 100, 20);
        // botao.setBackground(Color.CYAN);
        // botao2.setBackground(Color.CYAN);

        setLayout(null);
        setSize(600, 500); // tamanho da janela


        add(rotulo); // adiciona os rotulos e afins na janela
        add(botao);
        add(campo);
        add(rotulo2);
        add(botao2);
        add(campo2);

        setDefaultCloseOperation(EXIT_ON_CLOSE); // usa o botao de fechar (X)

        setVisible(true); // tem que usar para aparecer a tela
    }
}





