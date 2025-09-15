package abstratas.desenho;

import abstratas.figuras.FiguraGeometrica;

/*
 * Crie uma classe Desenho que possui dois atributos do tipo FiguraGeometrica (criado na 
 * questão anterior) e suas respectivas coordenadas em um plano bidimensional. Escreva 
 * m construtor para a classe Desenho que inicialize todos os atributos através dos parâmetros. 
 * Implemente também o método apresenta() que, para cada FiguraGeometrica 
 * em um Desenho, informa suas coordenadas e imprime sua descrição. Por fim, crie uma
 * classe executável, Principal, que cria dois objetos do tipo Desenho e chama seu meu método apresenta.
 *  O primeiro Desenho deve ser formado por um Circulo e um Quadrado e
 * o segundo por um Quadrado e um Triangulo.
 * 
 */

public class Desenho {
    private FiguraGeometrica figura1;
    private FiguraGeometrica figura2;
    private int x1, x2;
    private int y1, y2;

    public Desenho(FiguraGeometrica figura1, FiguraGeometrica figura2, int x1, int y1, int x2, int y2) {
        this.figura1 = figura1;
        this.figura2 = figura2;

        this.x1 = x1;
        this.y1 = y1;

        this.x2 = x2;
        this.y2 = y2;
    }

    public void apresenta(){
        System.out.println("Figura 1:");
        figura1.descricao();
        System.out.println("Nas coordenadas: ");
        System.out.println("X = " + x1 + " Y = " + y1);

        System.out.println("Figura 2:");
        figura2.descricao();
        System.out.println("Nas coordenadas: ");
        System.out.println("X = " + x2 + " Y = " + y2);
    }
}
