package reuso.pessoa;

public class Governador extends Politico {
    private String estado;

    public Governador(String nome, String cpf, String partidoPolitico, String estado) {
        super(nome, cpf, partidoPolitico);
        this.estado = estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        String res = super.toString();
        res += "Estado: " + estado + "\n";
        return res;
    }
}
