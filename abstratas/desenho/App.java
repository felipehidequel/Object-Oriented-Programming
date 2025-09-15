package abstratas.desenho;

import abstratas.figuras.Circulo;
import abstratas.figuras.Quadrado;

public class App {
    public static void main(String[] args) {
        Desenho desenho = new Desenho(new Quadrado(), new Circulo(), 1, 2, 2, 4);

        desenho.apresenta();
    }
}
