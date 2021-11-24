package br.com.exerciciosclasses;

public class Carro {
    private float consumoDeCombustivel;
    private float combustivelNoTanque;

    public Carro(float consumoDeCombustivel, float combustivelNoTanque) {
        this.setConsumoDeCombustivel(consumoDeCombustivel);
        this.setCombustivelNoTanque(combustivelNoTanque);
    }

    public void adicionarGasolina(float gasolina) {
        float totalDeCombustivel = this.combustivelNoTanque + gasolina;
        setCombustivelNoTanque(totalDeCombustivel);
        System.out.println("Foi adicionado " + gasolina + " l de gasolina no tanque");
    }

    public void obterGasolina() {
        if (this.combustivelNoTanque > 0) {
            System.out.println("\nTotal de combustível: " + this.combustivelNoTanque);
        } else {
            System.out.println("Não há combustível no tanque. Abasteça o carro!");
        }
    }

    public void andar(float distanciaPercorrida) {
        float litrosConsumidos = distanciaPercorrida / this.consumoDeCombustivel;
        float reducaoDoCombustivelNoTanque = this.combustivelNoTanque - litrosConsumidos;
        if (litrosConsumidos < this.combustivelNoTanque) {
            setCombustivelNoTanque(reducaoDoCombustivelNoTanque);
            System.out.printf("Consumo de combustível percorrendo %.2f km é %.2f l", distanciaPercorrida,
                    litrosConsumidos);
        } else {
            System.out.println("O consumo é maior que a quantidade de combustível no tanque. Abasteça o carro!");
        }
    }

    public float getCombustivelNoTanque() {
        return combustivelNoTanque;
    }

    public void setCombustivelNoTanque(float combustivelNoTanque) {
        this.combustivelNoTanque = combustivelNoTanque;
    }

    public float getConsumoDeCombustivel() {
        return consumoDeCombustivel;
    }

    public void setConsumoDeCombustivel(float consumoDeCombustivel) {
        this.consumoDeCombustivel = consumoDeCombustivel;
    }

}
