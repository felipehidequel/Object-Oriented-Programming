package exercicios_classe.lojaDeInformatica;

public class Fatura {
    String numeroIdentificacao;
    String descricao;
    int quantidadeComprada;
    double precoPorItem;

    public Fatura(String numeroIdentificacao, String descricao, int quantidadeComprada, double precoPorItem) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.descricao = descricao;
        this.quantidadeComprada = quantidadeComprada;
        if (quantidadeComprada < 0) {
            quantidadeComprada = 0;
        }
        this.precoPorItem = precoPorItem;
        if (precoPorItem < 0) {
            precoPorItem = 0.0;
        }
    }

    public double getValorFatura() {
        return quantidadeComprada * precoPorItem;
    }
}
