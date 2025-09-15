package abstratas.funcionario;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salarioPorHora;

    public Funcionario(String nome){
        this.nome = nome;
        cargo = "Cargo não registrado";
        salarioPorHora = 2;
    }

    public Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        salarioPorHora = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    public String toString() {
        String res = "Nome: " + nome + "\n";
        res += "Cargo: " + cargo + "\n";
        res += "Salario por hora: " + salarioPorHora;

        return res;
    }

    


}
