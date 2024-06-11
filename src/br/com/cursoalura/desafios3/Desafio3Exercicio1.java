package br.com.cursoalura.desafios3;

//Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.
//Super Classe: Carro

public class Desafio3Exercicio1 {
    //Criação dos atributos da super classe que serão herdados
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    //Criação de método para definir um modelo
    public void definirModelo(String modelo){
        this.modelo = modelo;
    }

    //Criação de método para definir preços de cada ano
    public void definirPrecos(double precoAno1,double precoAno2,double precoAno3){
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    //Criação de calculadora para dizer qual o maior preço comparativamente dos anos
    private double calculadoraDeMaiorPreco(){
        double maiorPreco = precoAno1;

        if (precoAno2 > maiorPreco) {
            maiorPreco = precoAno2;
        }

        if (precoAno3 > maiorPreco){
            maiorPreco = precoAno3;
        }

        return maiorPreco;
    }

    //Criação de calculadora para dizer qual o menor preço comparativamente dos anos
    private double calculadoraDeMenorPreco(){
        double menorPreco = precoAno1;

        if (precoAno2 < menorPreco) {
            menorPreco = precoAno2;
        }

        if (precoAno3 < menorPreco){
            menorPreco = precoAno3;
        }

        return menorPreco;
    }

    //Criação de método para mostrar as informações
    public void mostrarInformacoes(){
        System.out.println("Modelo: "+modelo);
        System.out.println("Preço Ano 1: R$"+precoAno1);
        System.out.println("Preço Ano 2: R$"+precoAno2);
        System.out.println("Preço Ano 3: R$"+precoAno3);
        System.out.println();
        System.out.println("MENOR PREÇO REGISTRADO: R$"+calculadoraDeMenorPreco());
        System.out.println("MAIOR PREÇO REGISTRADO: R$"+calculadoraDeMaiorPreco());
    }
}