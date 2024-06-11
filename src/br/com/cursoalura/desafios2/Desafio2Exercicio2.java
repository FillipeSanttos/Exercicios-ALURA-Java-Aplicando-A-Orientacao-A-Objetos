package br.com.cursoalura.desafios2;

// 2 - Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.

public class Desafio2Exercicio2 {
    //***Definição de atributos
    private String nome;
    private int idade;

    //***Criação de métodos SETTERS para atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //***Criação de métodos GETTERS para atributos
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    //***Criação de método para verificar maioridade
    public String verificarIdade(){
        if (idade>=18){
            return ("Você tem "+idade+" anos, portanto é maior de idade.");
        } else {
            return ("Você tem "+idade+" anos, portanto é menor de idade.");
        }
    }










}
