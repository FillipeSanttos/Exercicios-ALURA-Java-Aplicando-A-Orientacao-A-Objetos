package br.com.cursoalura.desafios3;

//Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.
//Sub Classe: GATO

public class Desafio3Exercicio2C2 extends Desafio3Exercicio2 {

    //Sobreescreve o método emitirSom da super classe para essa subclasse
    @Override
    public void emitirSom(){
        System.out.println("Gato: emite som: Miau Miau!");
    }

    //Criação de método exclusivo dessa subclasse
    public void arranharMoveis(){
        System.out.println("Gato: esta arranhando móveis.");
    }
}