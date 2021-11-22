package br.com.exerciciosclasses;

import br.com.exerciciosclasses.Ponto;

public class Retangulo {
    private Ponto base;
    private Ponto altura;

    public Retangulo(Ponto base, Ponto altura) {
        this.setBase(base);
        this.setAltura(altura);
    }

    public Ponto getAltura() {
        return altura;
    }

    public void setAltura(Ponto altura) {
        this.altura = altura;
    }

    public Ponto getBase() {
        return base;
    }

    public void setBase(Ponto base) {
        this.base = base;
    }

    public void calcularCentroDoRetangulo() {
        float x = (base.getX() * altura.getX()) / 2;
        float y = (base.getY() * altura.getY()) / 2;
        System.out.println("Coordenadas do centro do retângulo:\nX: " + x + "\nY: " + y);
    }

}
