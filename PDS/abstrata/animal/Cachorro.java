package abstrata.animal;

public class Cachorro extends Animal {
    public String nome;

    public Cachorro(String nome) {
        super(4);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void brincar() {
        System.out.println("Brincando auau");
    }


}