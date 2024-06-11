package br.com.cursoalura.desafios3;

//Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
//Super Classe: CONTA BANCARIA

public class Desafio3Exercicio3 {

    //Atributo Saldo Inicial da Conta
    public double valorEmConta=1000;

    //Método depositar valores
    public void depositar(double deposito){
        valorEmConta += deposito;
    }

    //Método sacar valores
    public void sacar(double saque){
        valorEmConta -= saque;
    }

    //Método mostrar saldo
    public void consultarsaldo(){
        System.out.println("Seu Saldo é de: R$"+valorEmConta);
    }

}
