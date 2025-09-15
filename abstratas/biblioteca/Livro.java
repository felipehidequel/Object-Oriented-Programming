package abstratas.biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int anoDaEdicao;

    public Livro(String titulo, String autor, int numeroDePaginas, int anoDaEdicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDaEdicao = anoDaEdicao;
    }

    public int getAnoDaEdicao() {
        return anoDaEdicao;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAnoDaEdicao(int anoDaEdicao) {
        this.anoDaEdicao = anoDaEdicao;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String qualTitulo() {
        return titulo;
    }

    public String qualAutor() {
        return autor;
    }

    @Override
    public String toString() {

        String res = titulo + " ";
        res += autor + " ";
        res += numeroDePaginas + " ";
        res += anoDaEdicao + " ";

        return res;
    }
}
