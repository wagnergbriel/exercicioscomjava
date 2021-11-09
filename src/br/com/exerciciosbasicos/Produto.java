package br.com.exerciciosbasicos;
import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        /*
            Informar valor, quantidade e o código de 2 produtos e do valor da porcentagem do ipi.
            Retornar o valor total a ser pago, apresentando o valorTotaldoProduto.
        */
        float valorDoProduto;
        float quantidadeDeProduto;
        float codigoDoProduto;
        float ipi = 5f;
        float valorParcialDoProduto = 0;
        float valorTotaldoProduto = 0;
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < 2; i++){
            System.out.println("Informe o codigo do produto:");
            codigoDoProduto = scanner.nextFloat();
            System.out.println("Informe o valor do produto:");
            valorDoProduto = scanner.nextFloat();
            System.out.println("Informe a quantidade do produto:");
            quantidadeDeProduto = scanner.nextFloat();

            valorParcialDoProduto += (valorDoProduto * quantidadeDeProduto);
        }
        valorTotaldoProduto = valorParcialDoProduto * (ipi/100f + 1f);
        System.out.printf("\nValor Total do Produto: %.2f\n", valorTotaldoProduto);
    }
}
