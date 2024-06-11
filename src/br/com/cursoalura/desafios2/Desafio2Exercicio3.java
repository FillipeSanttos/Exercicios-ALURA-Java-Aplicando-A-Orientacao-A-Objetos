package br.com.cursoalura.desafios2;

// 3 - Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.


public class Desafio2Exercicio3 {
    //***Definição de atributos
    private String nome;
    private double preco;

    //***Criação de métodos SETTERS para atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //***Criação de métodos GETTERS para atributos
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    //***Criação de método para aplicar desconto e retornar valor final
    public double aplicarDesconto(int porcentagemDesconto){
        double valorComDesconto = preco - (preco*porcentagemDesconto/100);
        return valorComDesconto;
    }
}