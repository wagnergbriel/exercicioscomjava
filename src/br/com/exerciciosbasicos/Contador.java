package br.com.exerciciosbasicos;

import java.util.Scanner;

public class Contador {
    /*
     * Informar um número inteiro e apresentar o seu antecessor e sucessor.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int antecessor;
        int sucessor;

        System.out.println("Digite o número:");
        numero = scanner.nextInt();

        antecessor = numero - 1;
        sucessor = numero + 1;

        System.out.printf("antecessor: %d\nAtual posição:%d\nSucessor:%d\n", antecessor, numero, sucessor);
    }
}
