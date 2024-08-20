package matriz;

public class Matriz {
    private int x, y;
    private float[][] matriz;

    Matriz(int x, int y) {
        this.x = x;
        this.y = y;

        matriz = new float[x][y];
    }

    public float calculaDeterminante(){
        float result;
        
        for(int i = 0, i<x*y; i++){
            result *= matriz[i][i];
        }

        return result;
    }

}
