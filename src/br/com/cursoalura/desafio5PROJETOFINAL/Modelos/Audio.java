package br.com.cursoalura.desafio5PROJETOFINAL.Modelos;

//SUPER CLASSE
//Podcast: classificar pelo total de curtidas. Música pelo total de reproducoes

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int totalClassificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getTotalClassificacao() {
        return totalClassificacao;
    }

    public void curtirAudio(){
        this.totalCurtidas++;
    }

    public void reproduzirAudio(){
        this.totalReproducoes++;
    }

}