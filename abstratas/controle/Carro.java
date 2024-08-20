package abstratas.controle;

public class Carro extends Terrestre {
    private String placa;

    Carro(int capacidade, int qtdRodas, String placa) {
        super(capacidade, qtdRodas);
        this.placa = placa;
    }

    public void moverFrente() {
        System.out.println("Carro movendo para frente");
    }

    @Override
    public String toString() {
        
        return "Carro [capacidade=" + super.getCapacidade() + ", qtdRodas=" + super.getQtdRodas() + ", placa=" + placa + "]";
    }
}
