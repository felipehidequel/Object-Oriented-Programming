package classes.faculdade;

public class RegistroAcademico {
    String nome;
    String matricula;
    int codigoCurso;
    double percentualDeCobrança;

    void inicializaRegistroAcademico(String nome, String matricula, int codigoCurso, double percentualDeCobrança) {
        this.nome = nome;
        this.matricula = matricula;
        this.codigoCurso = codigoCurso;
        this.percentualDeCobrança = percentualDeCobrança;
    }

    double calculaMensalidade() {
        return 100 * codigoCurso * percentualDeCobrança;
    }
}
