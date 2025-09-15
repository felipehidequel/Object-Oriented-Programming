package reuso.pessoa;

public class Prefeito extends Politico {
    private String cidade;

    public Prefeito(String nome, String cpf, String partidoPolitico, String cidade) {
        super(nome, cpf, partidoPolitico);
        this.cidade = cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        String res = super.toString();
        res += "Cidade: " + cidade + "\n";
        return res;
    }
}
