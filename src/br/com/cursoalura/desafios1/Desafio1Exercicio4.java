package br.com.cursoalura.desafios1;//4- Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.

public class Desafio1Exercicio4 {
    String modelo;
    int ano;
    String cor;
    int idade;

    void calcularIdade(int anoAtual){
        idade = (anoAtual-ano);
    }

    void exibaFichaTecnica(){
        System.out.println("""
                FICHA DO VÉICULO
                Modelo = %s
                Ano = %d
                Cor = %s
                Idade do Veículo = %d anos.
                """.formatted(modelo,ano,cor,idade));
    }
}