package br.com.exerciciosclasses;

public class BichinhoVirtual {
    // Modelando um tamagushi
    private String nome;
    private int fome;
    private int saude;
    private int idade;

    public BichinhoVirtual(String nome, int idade) {
        this.nome = nome;
        this.fome = 100;
        this.saude = 100;
        this.idade = idade;
    }

    public String alterarNome(String nome) {
        String antigoNome = getNome();
        setNome(nome);
        return "Antigo nome: " + antigoNome + "\nNovo Nome: " + getNome();
    }

    public int verificarFome() {
        setFome(getFome() - 1);
        return getFome();
    }

    public int verificarSaude() {
        setFome(getSaude() - 1);
        return getFome();
    }

    public int retornarIdade() {
        return getIdade();
    }

    public String verificarHumor() {
        int humor = (getFome() + getSaude()) / 2;
        return "Humor: " + humor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
