package br.com.cursoalura.desafios1;//3-Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

public class Desafio1Exercicio3 {
    String titulo;
    String artista;
    int anoLancamento;
    double valorTotalAvaliacoes;
    double mediaDasAvaliacoes;
    int quantidadeTotalAvaliacoes;

    void exibaFichaTecnica() {
        System.out.println("""
                FICHA MUSICAL
                Título da Música: %s
                Artista: %s
                Ano de Lançamento: %d
                Média de Avaliações: %.2f
                Quantidade de Avaliações: %d
                """.formatted(titulo, artista, anoLancamento, mediaDasAvaliacoes, quantidadeTotalAvaliacoes));
    }

    void avaliaMusica(double novaAvaliacao) {
        quantidadeTotalAvaliacoes++;
        valorTotalAvaliacoes += novaAvaliacao;
        mediaDasAvaliacoes = (valorTotalAvaliacoes / quantidadeTotalAvaliacoes);
    }
}