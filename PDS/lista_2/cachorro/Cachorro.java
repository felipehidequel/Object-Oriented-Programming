package cachorro;

class Cachorro{
    private String nome, raca;
    private int idade;

    public Cachorro(String nome, String raca, int idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public Cachorro(){
        this.nome = "Cachorro sem nome";
        this.raca = "nenhuma raça definida";
        this.idade = 0;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String toString(){
        String estado = "Nome: " + nome + " Raça: " + raca + " Idade: " + idade;
        return estado;
    }

    public Cachorro clonarCachorro(){
        return this;
    }
}