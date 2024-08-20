package reuso.empresa;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, String identidade, double salario) {
        super(nome, identidade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + " Salário: " + salario;
    }
}
