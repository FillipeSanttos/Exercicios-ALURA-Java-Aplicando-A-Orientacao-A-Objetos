package br.com.cursoalura.desafios4;

//Classe: ProdutosFisicos
//Se for produto físico, descontar R$50 de taxa

public class Desafio4Exercicio5C2 extends Desafio4Exercicio5 implements Desafio4Exercicio5C1 {


    @Override
    public void calcularPrecoFinal(double precoFinal) {
        precoFinal = getValorDoItem() - 50;
        System.out.println("O valor do item é R$" + precoFinal);
    }
}