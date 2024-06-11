package br.com.cursoalura.desafios4;

// 1 - Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.

//Classe: ConversorMoeda

public class Desafio4Exercicio1 implements Desafio4Exercicio1C1 {

    @Override
    public void converterDolarParaReal(double valorEmDolar) {
        System.out.println("O valor em reais é R$" + (valorEmDolar * 5.50));
    }
}