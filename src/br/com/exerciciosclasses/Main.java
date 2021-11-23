package br.com.exerciciosclasses;

public class Main {
    public static void main(String[] args) {
        BombaDeCombustivel carro = new BombaDeCombustivel("gasolina", 6, 200);
        carro.abastecerPorLitro(20);
        carro.abastecerPorValor(120);

    }
}
