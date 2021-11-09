package br.com.ExerciciosBasicos;
import java.util.Scanner;

public class Saldo {
    /*
        Informar o valor do saldo e calcular com o ajuste de 1%.
     */
    public static void main(String[] args){
        float saldo;
        float reajusteDoSaldo;
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Informe o saldo:");
        saldo = scanner.nextFloat();
        reajusteDoSaldo = saldo + (saldo * 00.1f);
        System.out.printf("Valor do saldo é R$ %.2f. Com reajuste é R$ %.2f \n", saldo, reajusteDoSaldo);
    }
}
