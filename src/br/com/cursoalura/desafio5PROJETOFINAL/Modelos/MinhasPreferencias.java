package br.com.cursoalura.desafio5PROJETOFINAL.Modelos;

public class MinhasPreferencias {

    public void incluirAudio(Audio audio){
        if (audio.getTotalClassificacao() >=9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e considerado por todos.");
        } else {
            System.out.println(audio.getTitulo() + " também é um dos que todo mundo esta curtindo.");
        }
    }
}
