package br.com.cursoalura.desafio5PROJETOFINAL;

import br.com.cursoalura.desafio5PROJETOFINAL.Modelos.MinhasPreferencias;
import br.com.cursoalura.desafio5PROJETOFINAL.Modelos.Musica;
import br.com.cursoalura.desafio5PROJETOFINAL.Modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        Musica novaMusica01 = new Musica();
        Podcast novoPodcast01 = new Podcast();


        novaMusica01.setTitulo("Musica de Dançar");
        novaMusica01.setAlbum("Album de Dançar");
        novaMusica01.setArtista("Dançarino");
        novaMusica01.setGenero("Dança");

        novaMusica01.curtirAudio();
        novaMusica01.reproduzirAudio();
        System.out.println(novaMusica01.getTotalCurtidas());
        System.out.println(novaMusica01.getTotalReproducoes());
        System.out.println(novaMusica01.getTotalClassificacao());


        novoPodcast01.setTitulo("Podcast do Dede");
        novoPodcast01.setDescricao("Podcast para ouvir enquanto dirige");
        novoPodcast01.setHost("Dede");
        novoPodcast01.curtirAudio();
        novoPodcast01.reproduzirAudio();

        System.out.println(novoPodcast01.getTotalCurtidas());
        System.out.println(novoPodcast01.getTotalReproducoes());
        System.out.println(novoPodcast01.getTotalClassificacao());


        MinhasPreferencias novasPreferidas = new MinhasPreferencias();
        novasPreferidas.incluirAudio(novoPodcast01);
        novasPreferidas.incluirAudio(novaMusica01);

        System.out.println();
        novoPodcast01.mostrarTodasAsInformacoes();
        System.out.println();
        novaMusica01.mostrarTodasAsInformacoes();



    }
}
