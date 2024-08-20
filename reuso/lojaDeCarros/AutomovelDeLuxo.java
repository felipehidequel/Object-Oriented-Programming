package reuso.lojaDeCarros;

public class AutomovelDeLuxo extends AutomovelBasico{
    private boolean arCondicionado;
    private boolean direcaoHidraulica;

    public AutomovelDeLuxo(int ano, String modelo, String cor, boolean airbag, boolean radio, boolean arCondicionado, boolean direcaoHidraulica) {
        super(ano, modelo, cor, airbag, radio);
        this.arCondicionado = arCondicionado;
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public boolean isDirecaoHidraulica() {
        return direcaoHidraulica;
    }

    @Override
    public double quantoCusta() {
        double custoAdicionais = 0;
        if (arCondicionado) {
            custoAdicionais += 20000;
        }
        if (direcaoHidraulica) {
            custoAdicionais += 15000;
        }
        return super.quantoCusta() + custoAdicionais;
    }
    
}
