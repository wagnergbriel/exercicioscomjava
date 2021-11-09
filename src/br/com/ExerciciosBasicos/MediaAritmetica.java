package br.com.ExerciciosBasicos;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args){
        /*
            Função do programa é estabelecer a quatidade de médias
            que devem ser somadas e informar a média aritmética ao usuário.
         */
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas vezes deseja repitir o processo ?");

        int numerodemedias;
        int somadosnumeros = 0;
        int media;

        numerodemedias = scanner.nextInt();

        int contador = numerodemedias; //Faz a contagem de loop.
        
        do{
            int numero;

            System.out.println("Digite a média que deseja calcular:");
            numero = scanner.nextInt();

            somadosnumeros += numero;
            contador--;
        }while(contador > 0);
        
        //Imprimir a média aritmética ao usuário.
        media = (somadosnumeros / numerodemedias);
        System.out.println("Média: " + media);
    }
}
