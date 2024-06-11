package br.com.cursoalura.screenmatch;

import br.com.cursoalura.screenmatch.calculos.CalculadoraDeTempoTotal;
import br.com.cursoalura.screenmatch.calculos.FiltroRecomendacao;
import br.com.cursoalura.screenmatch.modelos.Episodio;
import br.com.cursoalura.screenmatch.modelos.Filme;
import br.com.cursoalura.screenmatch.modelos.Serie;

public class PrincipalDoProjeto {
    public static void main(String[] args) {
        Filme filme01 = new Filme();


//        filme01.titulo = "Star Wars";   *NAO PODE SER MODIFICADO DIRETAMENTE, ATRIBUTE PRIVATE
//        filme01.ano = 1950;   *NAO PODE SER MODIFICADO DIRETAMENTE, ATRIBUTE PRIVATE
//        filme01.incluidoNoPlano = true;   *NAO PODE SER MODIFICADO DIRETAMENTE, ATRIBUTE PRIVATE
//        filme01.quantidadeDeAvaliacoes = 1;   *NAO PODE SER MODIFICADO DIRETAMENTE, ATRIBUTE PRIVATE
//        filme01.valorTotalAvaliacoes = 10;    *NAO PODE SER MODIFICADO DIRETAMENTE, ATRIBUTE PRIVATE

        filme01.setTitulo("Star Wars");    //*Modificar atributo privado através de setter
        filme01.setAno(1950); //*Modificar atributo privado através de setter
        filme01.setIncluidoNoPlano(true); //*Modificar atributo privado através de setter
        filme01.setDuracaoEmMinutos(180); //*Modificar atributo privado através de setter

        filme01.adicionarAvaliacao(10);
        filme01.adicionarAvaliacao(9);
        filme01.adicionarAvaliacao(8);
        filme01.adicionarAvaliacao(7);

        filme01.exibeFichaTecnica();
        System.out.println("Média de Notas " + filme01.mediaDeNotas());
        System.out.println("Total de Avaliações: " + filme01.getValorTotalAvaliacoes());


        Serie serie01 = new Serie();

        serie01.setTitulo("Lost");
        serie01.setAno(2000);
        serie01.setTemporadas(5);
        serie01.setEpisodiosPorTemporada(3);
        serie01.setMinutosPorEpisodio(30);


        System.out.println("Duração total em minutos da serie: " + serie01.getDuracaoEmMinutos());

        Filme filme02 = new Filme();
        filme02.setTitulo("Indiana Jones");    //*Modificar atributo privado através de setter
        filme02.setAno(1977); //*Modificar atributo privado através de setter
        filme02.setIncluidoNoPlano(true); //*Modificar atributo privado através de setter
        filme02.setDuracaoEmMinutos(100); //*Modificar atributo privado através de setter

        filme02.adicionarAvaliacao(10);
        filme02.adicionarAvaliacao(9);
        filme02.adicionarAvaliacao(8);
        filme02.adicionarAvaliacao(7);

        CalculadoraDeTempoTotal calculadora = new CalculadoraDeTempoTotal();
        calculadora.incluiTempoFilmes(filme01);
        calculadora.incluiTempoFilmes(filme02);
        calculadora.incluiTempoFilmes(serie01);
        System.out.println(calculadora.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        Episodio episodio01 = new Episodio();

        episodio01.setNome("Nome do Episodio");
        episodio01.setNumero(5);
        episodio01.setSerie(serie01);
        episodio01.setTotalVisualizações(300);

        filtro.filtrar(filme01);
        filtro.filtrar(filme02);
        filtro.filtrar(episodio01);
    }
}
