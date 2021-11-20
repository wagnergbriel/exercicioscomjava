package br.com.exerciciosclasses;

import java.util.ArrayList;
import java.util.List;

public class Macaco {
    private String nome;
    private String bucho;
    private List<String> estomago = new ArrayList<>();

    public Macaco(String nome) {
        this.nome = nome;
        this.bucho = "vazio";
    }

    public void comer(String comida) {
        estomago.add(comida);
    }

    public void verBucho() {
        if (estomago.size() > 0 && estomago.size() <= 3) {
            setBucho("satisfeito");
            System.out.println(
                    "O macaco " + nome + " comeu " + String.join(", ", estomago) + " e o seu bucho está " + bucho);

        } else if (estomago.size() > 3) {
            setBucho("cheio");
            System.out.println(
                    "O macaco " + nome + " comeu " + String.join(", ", estomago) + " e o seu bucho está " + bucho);
        }
    }

    // Implementar metodo digerir()

    public String getBucho() {
        return bucho;
    }

    public void setBucho(String bucho) {
        this.bucho = bucho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
