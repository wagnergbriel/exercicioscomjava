package br.com.exerciciosclasses;

import java.util.ArrayList;
import java.util.List;

public class Macaco {
    private String nome;
    private String bucho;
    private List<String> estomago = new ArrayList<>();

    public Macaco(String nome) {
        this.setNome(nome);
        this.bucho = "Vazio";

    }

    public void comer(String comida) {
        estomago.add(comida);
    }

    public void verBucho() {
        int qtdDeComida = 0;
        for (int i = 0; i < estomago.size(); i++) {
            qtdDeComida += 1;
        }

        if (qtdDeComida > 0 && qtdDeComida <= 3) {
            setBucho("Satisfeito");
            System.out.println(
                    "O macaco " + nome + " comeu " + String.join(", ", estomago) + " e o seu bucho está " + getBucho());

        } else if (qtdDeComida > 3) {
            setBucho("Cheio");
            System.out.println(
                    "O macaco " + nome + " comeu " + String.join(", ", estomago) + " e o seu bucho está " + getBucho());
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
