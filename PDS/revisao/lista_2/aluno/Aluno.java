package aluno;

public class Aluno {
    private String nome, situacao;
    private int matricula;
    private float nota1, nota2, nota3;
    private float media;

    public Aluno(){
        nome = "";
        situacao = "";
        matricula = 0;
        nota1 = 0.0f;
        nota2 = 0.0f;
        nota3 = 0.0f;
        media = 0.0f;
    }

    public Aluno(String nome, int matricula){
        this.nome = nome;
        situacao = "Matriculado";
        this.matricula = matricula;
        nota1 = 0.0f;
        nota2 = 0.0f;
        nota3 = 0.0f;
        media = 0.0f;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(float nota1, float nota2, float nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public boolean buscarAluno(Integer matricula) {
        return matricula.equals(this.matricula);
    }

    public String getNome() {
        return nome;
    }

    public String getSituacao() {
        return situacao;
    }

    public int getMatricula() {
        return matricula;
    }

    public float getNota1() {
        return nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public float getMedia() {
        return media;
    }

    public String alterarNota(int codNota, float valorNota) {
        if (codNota == 1) {
            nota1 = valorNota;
            return "Nota alterada";
        }

        else if (codNota == 1) {
            nota1 = valorNota;
            return "Nota alterada";

        }

        else if (codNota == 1) {
            nota1 = valorNota;
            return "Nota alterada";

        }

        return "Codigo de nota errado";

    }
}
