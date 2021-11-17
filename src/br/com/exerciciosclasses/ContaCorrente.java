package br.com.exerciciosclasses;

public class ContaCorrente {
    private int numeroDaConta;
    private String nomeDoCorrentista;
    private float saldoDaConta;

    public ContaCorrente(int numeroDaConta, String nomeDoCorrentista, float saldoDaConta) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.saldoDaConta = saldoDaConta;
    }

    public void alterarNome(String nome) {
        setNomeDoCorrentista(nome);
        System.out.println("Nome Atualizado com sucesso");
    }

    public void deposito(float valorDoDeposito) {
        setSaldoDaConta(getSaldoDaConta() + valorDoDeposito);
        System.out.printf("Deposito de %.2f -> Saldo atual:%.2f\n\n", valorDoDeposito, getSaldoDaConta());
    }

    public void saque(float valorDoSaque) {
        float saldoAtual;
        if (getSaldoDaConta() != 0 && getSaldoDaConta() > valorDoSaque) {
            System.out.printf("Valor do Saldo:%.2f", getSaldoDaConta());
            saldoAtual = getSaldoDaConta() - valorDoSaque;
            setSaldoDaConta(saldoAtual);
            System.out.printf("\nValor do saque:%.2f\nSaldo Atual:%.2f\n\n", valorDoSaque, getSaldoDaConta());
        } else {
            System.out.println("Saldo Insuficiente !");
        }
    }

    public float getSaldoDaConta() {
        return saldoDaConta;
    }

    public void setSaldoDaConta(float saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeDoCorrentista() {
        return nomeDoCorrentista;
    }

    public void setNomeDoCorrentista(String nomeDoCorrentista) {
        this.nomeDoCorrentista = nomeDoCorrentista;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
}