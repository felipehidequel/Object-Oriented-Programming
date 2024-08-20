package abstratas.controle;

public class Aviao extends Aereo {
    private String cadAviao;

    Aviao(int capacidade, String cadAnac, String cadAviao) {
        super(capacidade, cadAnac);
        this.cadAviao = cadAviao;
    }

    @Override
    public void moverFrente() {
        System.out.println("Aviao movendo para frente");
    }
}
