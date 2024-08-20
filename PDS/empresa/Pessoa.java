 package empresa;

 public abstract class Pessoa {
    String nome, identidade;
    

    public Pessoa(String nome, String identidade) {
        this.nome = nome;
        this.identidade = identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentidade() {
        return identidade;
    }
    public String getNome() {
        return nome;
    }

    public String toString() {
        return "Nome: " + nome + "\nIdentidade: " + identidade;
    }
}