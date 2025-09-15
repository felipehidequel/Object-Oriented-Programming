package reuso.pessoa;

public class Politico extends Pessoa {
    private String partidoPolitico;

    public Politico(String nome, String cpf, String partidoPolitico) {
        super(nome, cpf);
        this.partidoPolitico = partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    @Override
    public String toString() {
        String res = partidoPolitico;
        res += super.toString();
        return res;
    }
}
