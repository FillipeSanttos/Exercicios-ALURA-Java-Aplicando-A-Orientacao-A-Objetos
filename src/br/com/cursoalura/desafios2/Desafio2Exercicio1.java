package br.com.cursoalura.desafios2;
// 1 - Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.

public class Desafio2Exercicio1 {
    //***Definição de atributos
    private int numeroConta;
    private double saldo;
    private String titular;


    //***Criação de métodos SETTERS para atributos
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


    //***Criação de métodos GETTERS para atributos
    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}
