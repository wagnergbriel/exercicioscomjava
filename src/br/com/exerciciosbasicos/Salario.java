package br.com.exerciciosbasicos;

import java.util.Scanner;

public class Salario {
    /*
     * Informar o salário mínimo e máximo de um usuário. Retornar a quantidade de
     * salários mínimos do usuário.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float salarioMinimo;
        float salarioMaximo;
        float qtdDeSalarioMinimo;

        System.out.println("Digite o salário mínimo:");
        salarioMinimo = scanner.nextFloat();
        System.out.println("Digite o salário Máximo:");
        salarioMaximo = scanner.nextFloat();

        qtdDeSalarioMinimo = salarioMaximo / salarioMinimo;
        System.out.printf("Salário mínimo: %.1f\nSalário máximo: %.1f\nQuantidade de salário mínimo é %.1f\n",
                salarioMinimo, salarioMaximo, qtdDeSalarioMinimo);
    }
}
