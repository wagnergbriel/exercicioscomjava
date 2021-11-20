package br.com.exerciciosclasses;

public class Main {
    public static void main(String[] args) {
        BichinhoVirtual bv = new BichinhoVirtual("Pou", 1);
        System.out.println(bv.alterarNome("Tótó"));
        System.out.println(bv.verificarFome());
        System.out.println(bv.verificarSaude());
        System.out.println(bv.verificarSaude());
        System.out.println(bv.verificarSaude());
        System.out.println(bv.verificarHumor());
    }
}
