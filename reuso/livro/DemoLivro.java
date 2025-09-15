package reuso.livro;

public class DemoLivro {
    
    public static void main(String[] args) {
        Livro biblioteca = new LivroBiblioteca("Meditações", "Marco Aurelio", 4);
        Livro livraria = new LivroLivraria("Meditações", "Marco Aurelio", 4, 20);
    
        System.out.println(biblioteca);
        System.out.println();
        System.out.println(livraria);
    }
}
