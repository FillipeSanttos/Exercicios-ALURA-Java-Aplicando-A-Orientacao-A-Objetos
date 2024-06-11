package br.com.cursoalura.desafios2;

public class Desafio2Execucoes {
    public static void main(String[] args) {
// 1 - Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.

        Desafio2Exercicio1 contaBancaria = new Desafio2Exercicio1();

        //**Setar valores para os atributos.
        contaBancaria.setTitular("João das Neves");
        contaBancaria.setNumeroConta(1111111);
        contaBancaria.setSaldo(2533.93);
        //**Trazer valores dos atributos e mostrar.
        System.out.println("Titular da Conta: "+contaBancaria.getTitular());
        System.out.println("Número da Conta: "+contaBancaria.getNumeroConta());
        System.out.println("Saldo da Conta: "+contaBancaria.getSaldo());

// 2 - Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.

        Desafio2Exercicio2 idadePessoa = new Desafio2Exercicio2();

        //**Setar valores para os atributos.
        idadePessoa.setNome("João das Neves");
        idadePessoa.setIdade(15);
        //**Trazer valores dos atributos e mostrar.
        System.out.println("Nome: "+idadePessoa.getNome());
        System.out.println("Idade: "+idadePessoa.getIdade());
        //**Chamar método verificador de idade e mostrar.
        System.out.println(idadePessoa.verificarIdade());

// 3 - Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.

        Desafio2Exercicio3 produto = new Desafio2Exercicio3();

        //**Setar valores para os atributos.
        produto.setNome("Macarrão");
        produto.setPreco(189);
        //**Trazer valores dos atributos e mostrar.
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Preço Original: R$"+produto.getPreco());
        //**Chamar método adicionador de descontos, adicionar desconto e mostrar valor final.
        System.out.println("Valor do Desconto: 10%");
        System.out.println("Valor com Desconto: R$"+produto.aplicarDesconto(10));

        // 4 - Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.

        Desafio2Exercicio4 aluno = new Desafio2Exercicio4();

        //**Setar valores para os atributos.
        aluno.setNome("João das Neves");
        aluno.setNotaPrimeiroBimestre(8.3);
        aluno.setNotaSegundoBimestre(7.7);
        aluno.setNotaTerceiroBimestre(5.1);
        aluno.setNotaQuartoBimestre(9.4);
        //**Trazer valores dos atributos e mostrar.
        System.out.println("Nome: "+aluno.getNome());
        System.out.println("Nota 1B: "+aluno.getNotaPrimeiroBimestre());
        System.out.println("Nota 2B: "+aluno.getNotaSegundoBimestre());
        System.out.println("Nota 3B: "+aluno.getNotaTerceiroBimestre());
        System.out.println("Nota 4B: "+aluno.getNotaQuartoBimestre());
        //**Chamar método de cálculo de média e mostrar valor
        System.out.println("Média: "+aluno.calcularMedia());

        // 5 - Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.
        Desafio2Exercicio5 livro = new Desafio2Exercicio5();

        //**Setar valores para os atributos.
        livro.setTitulo("O Mágico de Oz");
        livro.setAutor("Frank Baum");

        //**Trazer valores dos atributos e mostrar.
        System.out.println("Nome do Livro: "+livro.getTitulo());
        System.out.println("Autor: "+livro.getAutor());

        //**Executar método que mostra o título e o autor.
        livro.exibirDetalhes();
    }
}
