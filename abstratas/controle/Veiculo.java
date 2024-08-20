package abstratas.controle;

public abstract class Veiculo {
    private int capacidade;

    public Veiculo(int capacidade) {
        this.capacidade = capacidade;
    }

    public abstract void moverFrente();

    public int getCapacidade() {
        return capacidade;
    }
}
