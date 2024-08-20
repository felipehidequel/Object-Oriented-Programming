package abstratas.financeiro;

public class EmpregadoAssalariado extends Empregado {
    private double salario;

    public EmpregadoAssalariado(String nome, String carteiraDeTrabalho, double salario) {
        super(nome, carteiraDeTrabalho);
        this.salario = salario;
    }

    public double valorDoPagamento() {
        return salario;
    }
}
