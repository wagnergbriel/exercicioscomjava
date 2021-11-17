package br.com.exerciciosclasses;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Wagner", 30, 60, 1.86f);
        System.out.println(pessoa.envelhecer());
        pessoa.emagrecer(1f);
        System.out.println(pessoa.getAltura());
        System.out.println(pessoa.getPeso());
    }
}
