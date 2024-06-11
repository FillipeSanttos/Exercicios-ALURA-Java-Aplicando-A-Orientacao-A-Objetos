package br.com.cursoalura.desafios4;

//CLASSE: PRODUTO
//Desconto arbitrário: R$1,50 a cada um comprado

public class Desafio4Exercicio6C1 implements Desafio4Exercicio6 {

    @Override
    public void precoTotalDoProdutouServicoAposDescontos(int quantidadeDeProdutouServico, double valorUnitarioDoProdutoOuServico) {
        double valorDaCompraTotal = quantidadeDeProdutouServico * valorUnitarioDoProdutoOuServico;
        double descontoTotal = quantidadeDeProdutouServico * 1.50;
        double valorFinal = valorDaCompraTotal - descontoTotal;
        System.out.println("O valor total da compra do produto com o desconto ficou em: R$" + valorFinal);
    }
}
