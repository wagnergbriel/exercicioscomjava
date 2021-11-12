package br.com.exerciciosclasses;

public class Quadrado {
    private float tamanhoDoLado;

    public Quadrado(float tamanhoDoLado) {
        this.setTamanhoDoLado(tamanhoDoLado);
    }

    public void mudarValorDoLado(float tamanhoDoLado) {
        setTamanhoDoLado(tamanhoDoLado);
    }

    public String retornarValorDoLado() {
        return "O valor do lado é " + getTamanhoDoLado();
    }

    public float calcularArea() {
        float area;
        area = (float) Math.pow(getTamanhoDoLado(), 2);
        return area;
    }

    public float getTamanhoDoLado() {
        return tamanhoDoLado;
    }

    public void setTamanhoDoLado(float tamanhoDoLado) {
        this.tamanhoDoLado = tamanhoDoLado;
    }

}
