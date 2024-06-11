package br.com.cursoalura.desafios3;

//Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
//Sub Classe: CONTA CORRENTE

public class Desafio3Exercicio3C1 extends Desafio3Exercicio3 {

    public void cobrarTarifaMensal(double tarifamensal){
        valorEmConta -= tarifamensal;
    }
}
