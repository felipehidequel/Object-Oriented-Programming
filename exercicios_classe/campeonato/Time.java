package exercicios_classe.campeonato;

public class Time {
    String nome;
    String tipoDeEsporte;
    int pontuacao;
    int quantidadeDeJogos;


    public Time(String nome, String tipoDeEsporte,int pontuacao, int quantidadeDeJogos) {
        this.nome = nome;
        this.tipoDeEsporte = tipoDeEsporte;
        this.pontuacao = pontuacao;
        this.quantidadeDeJogos = quantidadeDeJogos;
    }

    void mostraTime() {
        System.out.println("Nome do time: " + nome);
        System.out.println("Tipo de esporte: " + tipoDeEsporte);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Quantidade de jogos: " + quantidadeDeJogos);
    }

    void ganhouJogo(int pontos) {
        pontuacao += pontos;
        quantidadeDeJogos++;
    }

    void perdeuJogo(int pontos) {
        pontuacao -= pontos;
        quantidadeDeJogos++;
    }

}
