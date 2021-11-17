package br.com.exerciciosclasses;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(001, "Wagner", 200f);
        conta.deposito(50f);
        conta.saque(200f);
        conta.saque(45f);
        conta.deposito(1000f);
        conta.saque(600f);
    }
}
