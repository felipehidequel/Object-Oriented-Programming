package reuso.livro;

/*Escreva as classes LivroLivraria e LivroBiblioteca que herdam da classe Livro. Quais as
diferenças entre as duas classes e que campos elas têm em comum? Defina os atributos
de cada classe e escreva um aplicativo de teste que demonstre o uso das classes criadas. */

public class Livro {
    private String titulo;
    private String autor;
    private int anoLancamento;

    public Livro(String titulo, String autor, int anoLancamento) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        String res = "Titulo: " + titulo + "\n";
        res += "Autor: " + autor + "\n";
        res += "Ano: " + anoLancamento + "\n";
        return res;
    }

}
