package abstrata.animal;

public class Peixe extends Animal {
    public String nome;

    Peixe(String nome) {
        super(0);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void brincar() {
        System.out.println("Brincando na água");
    }

}