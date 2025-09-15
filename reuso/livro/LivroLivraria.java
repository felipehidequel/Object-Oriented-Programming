package reuso.livro;

public class LivroLivraria extends Livro {
    private double preco;

    public LivroLivraria(String titulo, String autor, int anoLancamento, double preco) {
        super(titulo, autor, anoLancamento);
        this.preco = preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        String res = super.toString();
        res += "Preço: R$" + preco;
        return res;
    }
}
