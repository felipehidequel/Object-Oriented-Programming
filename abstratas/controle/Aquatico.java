package abstratas.controle;

public abstract class Aquatico extends Veiculo {
    double profundidade;

    public Aquatico(int capacidade, double profundidade) {
        super(capacidade);
        this.profundidade = profundidade;
    }
}
