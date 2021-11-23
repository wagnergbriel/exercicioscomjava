package br.com.exerciciosclasses;

public class Main {
    public static void main(String[] args) {
        BombaDeCombustivel gasolina = new BombaDeCombustivel("gasolina", 6, 200);
        gasolina.abastecerPorLitro(20);
        gasolina.abastecerPorValor(120);

    }
}
