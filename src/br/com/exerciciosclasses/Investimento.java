package br.com.exerciciosclasses;

public class Investimento {
    private float taxaDejuros;
    private float saldoDaConta;

    public Investimento(float taxaDejuros, float saldoDaConta) {
        this.taxaDejuros = taxaDejuros;
        this.saldoDaConta = saldoDaConta;
    }

    // Metodo adicioneJuros

    public void adicioneJuros() {
        float saldoComJuros = this.saldoDaConta * (this.taxaDejuros / 100);
        float saldoAtual = this.saldoDaConta + saldoComJuros;
        setSaldoDaConta(saldoAtual);
    }

    public void visualizarSaldo() {
        System.out.println("Saldo atual: " + this.saldoDaConta + "\n");
    }

    public float getSaldoDaConta() {
        return saldoDaConta;
    }

    public void setSaldoDaConta(float saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    public float getTaxaDejuros() {
        return taxaDejuros;
    }

    public void setTaxaDejuros(float taxaDejuros) {
        this.taxaDejuros = taxaDejuros;
    }

}
