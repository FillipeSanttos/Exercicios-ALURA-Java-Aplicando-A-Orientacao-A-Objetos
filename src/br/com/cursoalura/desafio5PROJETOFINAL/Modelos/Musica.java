package br.com.cursoalura.desafio5PROJETOFINAL.Modelos;

//CLASSE

import br.com.cursoalura.desafio5PROJETOFINAL.Interfaces.MostrarInformacoes;

public class Musica extends Audio implements MostrarInformacoes {

    private String album;
    private String artista;
    private String genero;


    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Se total de reproducoes é maior que 300, classificar como 10. Caso contrário, classificar como 7.
    @Override
    public int getTotalClassificacao() {
        if (getTotalReproducoes() > 300) {
            return 10;
        } else {
            return 7;
        }


    }

    @Override
    public void mostrarTodasAsInformacoes() {
        System.out.println("Título da Música: "+getTitulo());
        System.out.println("Artista: "+getArtista());
        System.out.println("Álbum: "+getAlbum());
        System.out.println("Gênero: "+getGenero());
        System.out.println("Total de Reproduções: "+getTotalReproducoes());
        System.out.println("Total de Curtidas: "+getTotalCurtidas());
        System.out.println("Classificação: "+getTotalClassificacao());


    }
}
