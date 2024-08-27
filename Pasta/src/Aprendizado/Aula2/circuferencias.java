package Aprendizado.Aula2;

public class circuferencias {
    // Atributos
    public double area;
    public double raio;   // O raio da circunferência
    public double perc;   // Percentual de aumento para o raio

    // Método para calcular a área da circunferência
    public double calcularArea() {
        double area = 3.14 * (raio * raio);  // A área é π * raio^2
        return area;
    }

    // Método para calcular o novo raio após aumento percentual
    public double calcularRaio() {
        double valor = (perc / 100) + 1;  // Calcula o fator de aumento
        double novoRaio = raio * valor;   // Calcula o novo raio
        return novoRaio;
    }

    // Método para calcular o perímetro da circunferência
    public double calcularPerimetro() {
        double perimetro = 2 * 3.14 * raio;  // O perímetro é 2 * π * raio
        return perimetro;
    }

    // Método para visualizar os valores
    public void visualizarValores() {
        System.out.println("Raio original: " + raio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Novo raio (após aumento): " + calcularRaio());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
