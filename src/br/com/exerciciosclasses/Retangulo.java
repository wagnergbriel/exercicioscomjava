package br.com.exerciciosclasses;

public class Retangulo {
    private float base;
    private float altura;

    public Retangulo(float base, float altura) {
        this.setBase(base);
        this.setAltura(altura);
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }
}
