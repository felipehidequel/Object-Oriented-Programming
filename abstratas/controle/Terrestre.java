package abstratas.controle;

public abstract class Terrestre extends Veiculo {
    private int qtdRodas;

    public Terrestre(int capacidade,int qtdRodas) {
        super(capacidade);
        this.qtdRodas = qtdRodas;

    }

    public int getQtdRodas() {
        return qtdRodas;
    }
}
