package br.com.cursoalura.desafios4;

//2- Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.

//CLASSE: CalculadoraSalaRetangular

public class Desafio4Exercicio2 implements Desafio4Exercicio2C1 {


    @Override
    public void calcularArea(double altura, double largura) {
        double areaTotal = altura * largura;
        System.out.println("A área total é de: " + areaTotal);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetroTotal = 2 * altura + 2 * largura;
        System.out.println("O périmetro total é de: " + perimetroTotal);
    }
}