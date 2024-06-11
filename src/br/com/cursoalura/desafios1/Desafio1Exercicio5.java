package br.com.cursoalura.desafios1;//5-Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.

public class Desafio1Exercicio5 {
    String nome;
    int idade;

    void exibirInformacoes(){
        System.out.println("""
                FICHA DO ALUNO:
                Nome: %s
                Idade: %d anos
                """.formatted(nome,idade));
    }
}