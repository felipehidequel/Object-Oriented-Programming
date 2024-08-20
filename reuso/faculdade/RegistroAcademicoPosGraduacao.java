public class RegistroAcademicoPosGraduacao {
    private RegistroAcademico graduacao;
    private String tituloTese;
    private String orientador;

    public RegistroAcademicoPosGraduacao(RegistroAcademico a1, String tituloTese, String orientador) {
        this.graduacao = a1;
        this.tituloTese = tituloTese;
        this.orientador = orientador;
    }

    public String toString() {
        return graduacao.toString() + "\nTitulo da Tese: " + tituloTese + "\nOrientador: " + orientador;
    }
}
