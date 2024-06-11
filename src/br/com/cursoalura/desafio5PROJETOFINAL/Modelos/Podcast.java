package br.com.cursoalura.desafio5PROJETOFINAL.Modelos;

//CLASSE

import br.com.cursoalura.desafio5PROJETOFINAL.Interfaces.MostrarInformacoes;

public class Podcast extends Audio implements MostrarInformacoes {

    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //Se total de curtidas é maior que 500, classificar como 10. Caso contrário, classificar como 8.
    @Override
    public int getTotalClassificacao() {
        if (getTotalCurtidas()>500){
            return 10;
        } else {
            return 8;
        }
    }

    @Override
    public void mostrarTodasAsInformacoes() {
        System.out.println("Título do Podcast: "+getTitulo());
        System.out.println("Host: "+getHost());
        System.out.println("Descrição: "+getDescricao());
        System.out.println("Total de Reproduções: "+getTotalReproducoes());
        System.out.println("Total de Curtidas: "+getTotalCurtidas());
        System.out.println("Classificação: "+getTotalClassificacao());

    }
}
