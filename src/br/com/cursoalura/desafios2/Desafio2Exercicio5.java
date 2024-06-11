package br.com.cursoalura.desafios2;

// 5 - Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.

public class Desafio2Exercicio5 {
    //***Definição de atributos
    private String titulo;
    private String autor;

    //***Criação de métodos SETTERS para atributos
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //***Criação de métodos GETTERS para atributos
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    //***Método para mostrar título e autor.
    public void exibirDetalhes(){
        System.out.println("""
                Título do Livro: %s
                Autor: %s
                """.formatted(titulo,autor));
    }
}