package abstratas.biblioteca;

public class App {

    public static void main(String[] args) {
        LivroDeBiblioteca l = new LivroDeBiblioteca("Meditações", "Marco Aurelio", 144, 12, "II", "1",
                "Diario de um dos ultimos grande imperadores romanos");
                System.err.println(l);
                
                l.empresta();
                l.estaEmprestado();
                l.devolve();
                // System.out.println(l.qualAutor() + l.qualTitulo());
                
                
    }

}
