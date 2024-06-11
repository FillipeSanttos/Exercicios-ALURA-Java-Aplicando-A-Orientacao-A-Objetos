package br.com.cursoalura.desafios4;

//Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada() para exibir a tabuada de um número. A classe deve receber o número como parâmetro.
//CLASSE: TabuadaMultiplicacao

public class Desafio4Exercicio3 implements Desafio4Exercicio3C1 {

    @Override
    public void mostrarTabuada(int numeroDaTabuada) {
        System.out.println("Tabuada do " + numeroDaTabuada);

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " x " + numeroDaTabuada + " = " + (numeroDaTabuada * i));
        }
    }
}