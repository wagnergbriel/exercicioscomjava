package br.com.exerciciossimples;

import java.util.Scanner;

public class Idade { 
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva sua idade em anos, meses e dias:");
        
        int ano;
        int mes;
        int dia;
        int resultadoIdade;

        ano = scanner.nextInt();
        mes = scanner.nextInt();
        dia = scanner.nextInt();
        
        resultadoIdade = (356 * ano) + (30 * mes) + dia;
        System.out.println("A idade expressa em dias é: " + resultadoIdade);
     }
}
