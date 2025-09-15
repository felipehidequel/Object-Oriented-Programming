package abstratas.biblioteca;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
    private boolean emprestado;
    private String bloco;
    private String numeroDePrateleira;
    private String descricao;

    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDaEdicao, String bloco,
            String numeroDePrateleira, String descricao) {
        super(titulo, autor, numeroDePaginas, anoDaEdicao);
        this.emprestado = false;
        this.bloco = bloco;
        this.numeroDePrateleira = numeroDePrateleira;
        this.descricao = descricao;
    }

    public boolean estaEmprestado() {
        return emprestado;
    }

    public void empresta() {
        this.emprestado = true;
    }

    public void devolve() {
        this.emprestado = false;
    }

    public String localizacao() {
        return bloco + ", " + numeroDePrateleira;
    }

    public String descricao() {
        return descricao;
    }

    @Override
    public String toString() {
        String res = super.toString() + "\n";
        res += emprestado?"Emprestado ":"Na estante \n";
        res += localizacao();

        return res;
    }
}
