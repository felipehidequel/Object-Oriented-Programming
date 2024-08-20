package abstratas.financeiro;

public abstract class Empregado implements Pagavel {
    private String nome;
    private String carteiraDeTrabalho;

    public Empregado(String nome,String carteiraDeTrabalho) {
        this.nome = nome;
        this.carteiraDeTrabalho = carteiraDeTrabalho;
    }
    
}
