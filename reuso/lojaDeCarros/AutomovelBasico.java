package reuso.lojaDeCarros;

public class AutomovelBasico extends Automovel {
    private boolean airbag;
    private boolean radio;

    public AutomovelBasico(int ano, String modelo, String cor, boolean airbag, boolean radio) {
        super(ano, modelo, cor);
        this.airbag = airbag;
        this.radio = radio;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public boolean isRadio() {
        return radio;
    }

    @Override
    public double quantoCusta() {
        double custoAdicionais = 0;
        if (airbag) {
            custoAdicionais += 10000;

        }
        if (radio) {
            custoAdicionais += 5000;
        }
        return super.quantoCusta() + custoAdicionais;
    }
}
