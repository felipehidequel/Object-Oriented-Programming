package abstratas.financeiro;

public class Fatura implements Pagavel{
    private double preco;
    private int qtd;

    public Fatura(double preco, int qtd) {
        this.preco = preco;
        this.qtd = qtd;
    }

    public double valorDoPagamento() {
        return preco * qtd;
    }

}
