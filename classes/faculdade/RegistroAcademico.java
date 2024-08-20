package classes.faculdade;

public class RegistroAcademico {
    private String nome;
    private String matricula;
    private int codigoCurso;
    private double percentualDeCobrança;

    public void inicializaRegistroAcademico(String nome, String matricula, int codigoCurso, double percentualDeCobrança) {
        this.nome = nome;
        this.matricula = matricula;
        this.codigoCurso = codigoCurso;
        this.percentualDeCobrança = percentualDeCobrança;
    }

    public void print(){
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Código do curso: " + codigoCurso);
        System.out.println("Percentual de cobrança: " + percentualDeCobrança);
    }

    public double calculaMensalidade() {
        return 100 * codigoCurso * percentualDeCobrança;
    }
}
