package br.com.exerciciosclasses;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        System.out.println(tv.toString());
        tv.ligarTv();
        System.out.println(tv.toString());
        tv.aumentarVolume();
        System.out.println(tv.toString());
        tv.aumentarVolume();
        System.out.println(tv.toString());
        tv.abaixarVolume();
        System.out.println(tv.toString());
    }
}
