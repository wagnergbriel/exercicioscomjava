package br.com.exerciciosclasses;

public class TV {
    private boolean ligado;
    private int volume;

    public TV() {
        this.ligado = false;
        this.volume = 50;
    }

    public void ligarTv() {
        if (!getLigado()) {
            System.out.println("Ligando TV!");
            setLigado(true);
        } else {
            System.out.println("TV não está ligada!");
        }
    }

    public void desligarTv() {
        if (getLigado()) {
            setLigado(false);
            System.out.println("Desligando TV!");
        } else {
            System.out.println("Tv já está desligada!");
        }
    }

    public int aumentarVolume() {
        return volume++;
    }

    public int abaixarVolume() {
        return volume--;
    }

    public String toString() {
        return "Status da Tv: " + getLigado() + "\nVolume: " + getVolume();
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}