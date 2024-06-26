package br.com.cursoalura.screenmatch.modelos;//Modelagem de Classe: definição dos atributos para a classe filme
//Abstração dos elementos necessários dessa classe para este projeto específico

import br.com.cursoalura.screenmatch.calculos.Classificavel;

public class Filme extends Titulos implements Classificavel {
private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    //Dividir a nota total por 2 para simular estrelas de 1 a 5
    @Override
    public int getClassificacao() {
        return (int) mediaDeNotas() / 2;
    }
}
