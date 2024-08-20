package reuso.empresa;

public class Pessoa {
    private String nome;
    private String identidade;

    public Pessoa(String nome, String identidade) {
        this.nome = nome;
        this.identidade = identidade;
    }

    public String getIdentidade() {
        return identidade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Nome: " + nome + " Identidade: " + identidade;
    }
}
