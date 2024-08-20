package reuso.empresa;

public class GerenteDeDepartamento extends Funcionario {
    private String departamento;

    public GerenteDeDepartamento(String nome, String identidade, double salario, String departamento) {
        super(nome, identidade, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + " Departamento: " + departamento;
    }
}
