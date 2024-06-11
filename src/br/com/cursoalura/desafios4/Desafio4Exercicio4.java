package br.com.cursoalura.desafios4;

//4- Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.
//CLASSE: ConversorTemperaturaPadrao

public class Desafio4Exercicio4 implements Desafio4Exercicio4C1 {


    @Override
    public void celsiusParaFahrenheit(double temperaturaCelsius) {
        double temperaturaConvertida = (temperaturaCelsius * 1.8 + 32);
        System.out.println("A temperatura em Fahrenheit é de " + temperaturaConvertida);
    }

    @Override
    public void fahrenheitParaCelsius(double temperaturaFahrenheit) {
        double temperaturaConvertida = (temperaturaFahrenheit - 32) / 1.8;
        System.out.println("A temperatura em Celsius é de " + temperaturaConvertida);
    }
}