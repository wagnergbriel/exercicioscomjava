package br.com.exerciciosclasses;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.ligarTv();
        System.out.println(tv.getLigado());
        tv.desligarTv();
        System.out.println(tv.getLigado());
    }
}
