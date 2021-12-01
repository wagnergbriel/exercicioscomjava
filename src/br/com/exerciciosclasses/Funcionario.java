package br.com.exerciciosclasses;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double juros) {
        double salarioComJuros = this.salario * (juros / 100);
        double salarioAtual = this.salario + salarioComJuros;
        setSalario(salarioAtual);
    }

    public void visualizarSalario() {
        System.out.println("Salário Atual: " + this.salario);
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
