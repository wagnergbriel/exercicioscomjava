package br.com.exerciciosclasses;

public class Main {
    public static void main(String[] args) {
        Funcionario joao = new Funcionario("Joao", 2500);
        joao.aumentarSalario(20);
        joao.visualizarSalario();
        joao.aumentarSalario(20);
        joao.visualizarSalario();
    }
}
