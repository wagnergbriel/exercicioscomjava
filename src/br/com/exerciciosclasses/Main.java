package br.com.exerciciosclasses;

public class Main {
    public static void main(String[] args) {
        Investimento investimento = new Investimento(10, 1000);
        investimento.adicioneJuros();
        investimento.adicioneJuros();
        investimento.adicioneJuros();
        investimento.adicioneJuros();
        investimento.adicioneJuros();
        investimento.visualizarSaldo();
    }
}
