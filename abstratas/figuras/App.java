package abstratas.figuras;

/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Circulo cir = new Circulo();
        Quadrado qua = new Quadrado();
        Triangulo tri = new Triangulo();

        cir.descricao();
        qua.descricao();
        tri.descricao();
    }
}