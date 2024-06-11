package br.com.cursoalura.desafios3;

public class Desafio3Execucoes {
    public static void main(String[] args) {

        //Exercício 1:
        Desafio3Exercicio1C1 novoVeiculo = new Desafio3Exercicio1C1();

        novoVeiculo.definirModelo("Sedan");
        novoVeiculo.definirPrecos(20, 10, 50);
        novoVeiculo.mostrarInformacoes();

        //Exercício 2:
        Desafio3Exercicio2 novoAnimal = new Desafio3Exercicio2();
        novoAnimal.emitirSom();

        Desafio3Exercicio2C1 novoCachorro = new Desafio3Exercicio2C1();
        novoCachorro.emitirSom();
        novoCachorro.abanarRabo();

        Desafio3Exercicio2C2 novoGato = new Desafio3Exercicio2C2();
        novoGato.emitirSom();
        novoGato.arranharMoveis();

        //Exercício 3:
        Desafio3Exercicio3C1 novaConta = new Desafio3Exercicio3C1();

        novaConta.consultarsaldo();
        novaConta.depositar(500);  //depositar
        novaConta.consultarsaldo();
        novaConta.sacar(300); //sacar
        novaConta.consultarsaldo();
        novaConta.cobrarTarifaMensal(57.10); //cobrar tarifa mensal
        novaConta.consultarsaldo();

        //Exercício 4:

        Desafio3Exercicio4C1 verificador = new Desafio3Exercicio4C1();
        verificador.verificarSeEhPrimo(17);

        Desafio3Exercicio4C2 gerador = new Desafio3Exercicio4C2();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        Desafio3Exercicio4 numerosPrimos = new Desafio3Exercicio4();
        numerosPrimos.listarPrimos(30);
    }
}
