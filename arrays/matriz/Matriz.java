package matriz;

import java.util.Random;

public class Matriz {
    private int x, y;
    private float[][] matriz;

    Matriz() {
        this.x = 2;
        this.y = 2;
        Random rand = new Random();

        matriz = new float[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matriz[i][j] = rand.nextInt(9);
            }
        }
    }

    public float calculaDeterminante() {
        return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
    }

    public void imprimir() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
