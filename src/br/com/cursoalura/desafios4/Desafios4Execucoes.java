package br.com.cursoalura.desafios4;

public class Desafios4Execucoes {
    public static void main(String[] args) {

        //1 -
        System.out.println();
        System.out.println("Desafio 1:");
        Desafio4Exercicio1 novaConversao = new Desafio4Exercicio1();
        novaConversao.converterDolarParaReal(50);

        //2-
        System.out.println();
        System.out.println("Desafio 2:");
        Desafio4Exercicio2 novoRetangulo = new Desafio4Exercicio2();
        novoRetangulo.calcularArea(5, 10);
        novoRetangulo.calcularPerimetro(5, 10);

        //3-
        System.out.println();
        System.out.println("Desafio 3:");
        Desafio4Exercicio3 novaTabuada = new Desafio4Exercicio3();
        novaTabuada.mostrarTabuada(74);
        System.out.println();

        //4-
        System.out.println();
        System.out.println("Desafio 4:");
        Desafio4Exercicio4 novaTemperatura = new Desafio4Exercicio4();
        novaTemperatura.celsiusParaFahrenheit(50);
        novaTemperatura.fahrenheitParaCelsius(122);

        //5-
        System.out.println();
        System.out.println("Desafio 5:");
        Desafio4Exercicio5 novoItem = new Desafio4Exercicio5();
        Desafio4Exercicio5C2 novoProdutoFisico = new Desafio4Exercicio5C2();
        Desafio4Exercicio5C3 novoLivro = new Desafio4Exercicio5C3();

        //****Setar valor para cada um dos itens
        novoProdutoFisico.setValorDoItem(200);
        novoLivro.setValorDoItem(80);

        //****Calcular valor final de cada item com o desconto específico de cada um
        novoProdutoFisico.calcularPrecoFinal(novoProdutoFisico.getValorDoItem());
        novoLivro.calcularPrecoFinal(novoLivro.getValorDoItem());

        //6-
        System.out.println();
        System.out.println("Desafio 6:");
        Desafio4Exercicio6C1 novoProduto = new Desafio4Exercicio6C1();
        Desafio4Exercicio6C2 novoServico = new Desafio4Exercicio6C2();

        novoProduto.precoTotalDoProdutouServicoAposDescontos(5, 60);
        novoServico.precoTotalDoProdutouServicoAposDescontos(30, 80);
    }
}