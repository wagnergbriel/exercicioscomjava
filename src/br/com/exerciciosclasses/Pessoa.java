package br.com.exerciciosclasses;

public class Pessoa {
    private String nome;
    private int idade;
    private float peso;
    private float altura;

    public Pessoa(String nome, int idade, float peso, float altura) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setPeso(peso);
        this.setAltura(altura);
    }

    public int envelhecer() {
        if (getIdade() < 21) {
            crescer(0.5f);
            return getIdade() + 1;
        } else {
            return getIdade() + 1;
        }

    }

    public void engordar(float pesoAtual) {
        setPeso(getPeso() + pesoAtual);
    }

    public void emagrecer(float pesoAtual) {
        setPeso(getPeso() - pesoAtual);
    }

    public void crescer(float alturaAtual) {
        setAltura(getAltura() + alturaAtual);
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}