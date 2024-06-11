package br.com.cursoalura.desafios4;

//CLASSE: SERVICO
//Desconto arbitrário: R$2,00 a cada um comprado

public class Desafio4Exercicio6C2 implements Desafio4Exercicio6 {
    @Override
    public void precoTotalDoProdutouServicoAposDescontos(int quantidadeDeProdutouServico, double valorUnitarioDoProdutoOuServico) {
        double valorDaCompraTotal = quantidadeDeProdutouServico * valorUnitarioDoProdutoOuServico;
        double descontoTotal = quantidadeDeProdutouServico * 2;
        double valorFinal = valorDaCompraTotal - descontoTotal;
        System.out.println("O valor total da compra do serviço com o desconto ficou em: R$" + valorFinal);
    }
}
