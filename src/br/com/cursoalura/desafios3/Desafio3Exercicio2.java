package br.com.cursoalura.desafios3;

//Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.
//Super Classe: ANIMAL

public class Desafio3Exercicio2 {

    //Criação de método na superclasse que será herdada pelas subclasses
    public void emitirSom(){
        System.out.println("Animal esta emitindo um som!");
    }
}
