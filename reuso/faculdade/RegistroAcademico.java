class RegistroAcademico {
    private String nomeAluno;
    private int matricula;
    private String curso;

    public RegistroAcademico(String nomeAluno, int matricula, String curso) {
        this.nomeAluno = nomeAluno;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String toString() {
        return "Nome: " + nomeAluno + "\nMatricula: " + matricula + "\nCurso: " + curso;
    }
}