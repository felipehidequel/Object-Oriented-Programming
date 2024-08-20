package classes.banco;

public class Conta {
    private String nome;
    private double saldo;
    private boolean especial;

    public Conta(String nome, double saldo, boolean especial) {
        this.nome = nome;
        this.saldo = saldo;
        this.especial = especial;
    }

    public Conta(String nome) {
        this.nome = nome;
        this.saldo = 0.0;
        this.especial = false;
    }

    public String toString() {
        return "Nome: " + nome +
                "\nSaldo: " + saldo +
                "\nEspecial: " + (especial? "Sim" : "Não");
    }
}
