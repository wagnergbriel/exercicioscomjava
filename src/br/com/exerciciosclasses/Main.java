package br.com.exerciciosclasses;

public class Main {
    public static void main(String[] args) {
        Macaco mico = new Macaco("Pretinho");
        mico.comer("Banana");
        mico.comer("Maça");
        mico.verBucho();
        mico.digerir();
        mico.verBucho();
    }
}
