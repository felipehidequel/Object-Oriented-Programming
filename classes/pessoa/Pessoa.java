package pessoa;

public class Pessoa {
    private String nome;
    private Double altura;

    Pessoa(String nome, Double altura) {
        this.nome = nome;
        this.altura = altura;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()) this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getAltura() {
        return altura;
    }

    public String toString() {
        return "Nome: " + nome + "\nAltura: " + altura;
    }
}
