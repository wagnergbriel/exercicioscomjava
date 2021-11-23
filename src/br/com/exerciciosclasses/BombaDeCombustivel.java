package br.com.exerciciosclasses;

public class BombaDeCombustivel {
    private String tipoDeCombustivel;
    private float valorDoLitro;
    private float quantidadeDeCombustivel; // Quantidade de combustível na bomba

    public BombaDeCombustivel(String tipoDeCombustivel, float valorDoLitro, float quantidadeDeCombustivel) {
        this.setTipoDeCombustivel(tipoDeCombustivel);
        this.setValorDoLitro(valorDoLitro);
        this.setQuantidadeDeCombustivel(quantidadeDeCombustivel);
    }

    public void abastecerPorValor(float valorDoCombustivel) {
        float litrosDeCombustivel = valorDoCombustivel / valorDoLitro;
        if (quantidadeDeCombustivel > litrosDeCombustivel) {
            System.out.println(valorDoCombustivel + " reais deu " + litrosDeCombustivel + " de combustível");
        } else {
            System.out.println("Não há combustível suficiente na bomba");
        }
    }

    public void abastecerPorLitro(float quantidadeDeLitro) {
        float valorDoAbastecimento = quantidadeDeLitro * valorDoLitro;
        if (quantidadeDeCombustivel > quantidadeDeLitro) {
            System.out.println(quantidadeDeLitro + " litros de combustível deu " + valorDoAbastecimento + " reais");
        } else {
            System.out.println("Não há combustível suficiente na bomba");
        }
    }

    public void alterarValor(float valorDoLitro) {
        setValorDoLitro(valorDoLitro);
    }

    public void alterarCombustivel(String tipoDeCombustivel) {
        setTipoDeCombustivel(tipoDeCombustivel);
    }

    public void alterarQuantidadeCombustivel(float quantidadeDeCombustivel) {
        setQuantidadeDeCombustivel(quantidadeDeCombustivel);
    }

    public float getQuantidadeDeCombustivel() {
        return quantidadeDeCombustivel;
    }

    public void setQuantidadeDeCombustivel(float quantidadeDeCombustivel) {
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
    }

    public float getValorDoLitro() {
        return valorDoLitro;
    }

    public void setValorDoLitro(float valorDoLitro) {
        this.valorDoLitro = valorDoLitro;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

}