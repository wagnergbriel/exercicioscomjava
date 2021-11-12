package br.com.exerciciosclasses;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(6);
        System.out.println(quadrado.retornarValorDoLado());
        System.out.println(quadrado.calcularArea());
        quadrado.mudarValorDoLado(32);
        System.out.println(quadrado.retornarValorDoLado());
        System.out.println(quadrado.calcularArea());

    }
}
