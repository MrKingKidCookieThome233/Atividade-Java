package com.pratica;
public class ContaBancaria {
    String numero;
    double saldo;

    public ContaBancaria(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado. Saldo: " + saldo);
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Saldo: " + saldo);
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("001-5", 1000.00);

        conta.depositar(500.00);
        conta.sacar(200.00);
        conta.sacar(2000.00);
        System.out.println("Saldo final: " + conta.consultarSaldo());
    }
}
