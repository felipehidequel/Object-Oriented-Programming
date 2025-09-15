package reuso.funcionarios;

public class Administrativo extends Assistente {
    private String turno;
    private double adicionalNoturno;

    public Administrativo(String nome, double salario, int numeroMatricula, String turno, double adicionalNoturno) {
        super(nome, salario, numeroMatricula);
        this.turno = turno.toUpperCase();
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public double ganhoAnual() {
        double adicional = (turno == "NOITE") ? adicionalNoturno : 0;
        adicional *= 12;
        return super.ganhoAnual() + adicional;
    }
}
