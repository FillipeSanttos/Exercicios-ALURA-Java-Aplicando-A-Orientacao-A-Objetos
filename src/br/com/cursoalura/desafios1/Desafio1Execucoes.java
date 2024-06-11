package br.com.cursoalura.desafios1;//Resoluções do Desafio1 - Exercícios

public class Desafio1Execucoes {
    public static void main(String[] args) {
        //1 - Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
        Desafio1Exercicio1 pessoa1 = new Desafio1Exercicio1();
        pessoa1.digahelloworld();

        //2 - Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
        Desafio1Exercicio2 calculadora2 = new Desafio1Exercicio2();
        calculadora2.valorACalcular = 5;
        System.out.println(calculadora2.resultadoCalculadora());

        //3-Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
        Desafio1Exercicio3 musica3 = new Desafio1Exercicio3();
        musica3.titulo = "Playful Dog";
        musica3.artista = "Dj Dogge";
        musica3.anoLancamento = 2009;

        musica3.avaliaMusica(10);
        musica3.avaliaMusica(5);
        musica3.avaliaMusica(7);
        musica3.avaliaMusica(8);
        musica3.avaliaMusica(10);
        musica3.avaliaMusica(9);
        musica3.avaliaMusica(5);
        musica3.avaliaMusica(3);
        musica3.avaliaMusica(1);
        musica3.exibaFichaTecnica();

        //4- Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
        Desafio1Exercicio4 carro4 = new Desafio1Exercicio4();
        carro4.modelo = "Fiat";
        carro4.ano = 1992;
        carro4.cor = "Branco";
        carro4.calcularIdade(2024);
        carro4.exibaFichaTecnica();

        //5- Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
        Desafio1Exercicio5 aluno5 = new Desafio1Exercicio5();
        aluno5.nome = "Joao das Neves";
        aluno5.idade = 12;
        aluno5.exibirInformacoes();
    }
}