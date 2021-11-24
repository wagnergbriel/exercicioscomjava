package br.com.exerciciosclasses;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(10, 0);
        carro.obterGasolina();
        carro.adicionarGasolina(100);
        carro.andar(50);
        carro.obterGasolina();
        carro.andar(250);
        carro.obterGasolina();
    }
}
