package br.com.exerciciosclasses;

public class Main {
    public static void main(String[] args) {
        Ponto a = new Ponto(2, 3);
        Ponto b = new Ponto(9, 1);
        a.exibirCoordenadas();
        b.exibirCoordenadas();
        Retangulo x = new Retangulo(a, b);
        x.calcularCentroDoRetangulo();
    }
}
