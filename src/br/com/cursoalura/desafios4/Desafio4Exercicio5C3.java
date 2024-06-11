package br.com.cursoalura.desafios4;

//Classe: Livros
//Se for livro, descontar R$20 de taxa

public class Desafio4Exercicio5C3 extends Desafio4Exercicio5 implements Desafio4Exercicio5C1 {

    @Override
    public void calcularPrecoFinal(double precoFinal) {
        precoFinal = getValorDoItem() - 20;
        System.out.println("O valor do item é R$" + precoFinal);
    }
}