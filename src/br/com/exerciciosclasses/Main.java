package br.com.exerciciosclasses;

public class Main {
    public static void main(String[] args) {
        Bola bola = new Bola("Azul", 2, "Plastico");
        System.out.println(bola.mostrarCor());
        bola.trocarCor("Vermelho");
        System.out.println(bola.mostrarCor());
    }
}
