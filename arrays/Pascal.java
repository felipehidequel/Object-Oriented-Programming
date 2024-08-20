import java.util.Scanner;

public class Pascal {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int nLinhas;

        System.out.println("Digite o número de linhas: ");
        nLinhas = sc.nextInt();
        int triangulo[][] = new int[nLinhas][];

        for(int l = 0; l< triangulo.length; l++){
            triangulo[l] = new int[l+2];
            triangulo[l][0] = 1;
            triangulo[l][triangulo[l].length-1] = 1;

            for (int c = 1; c < triangulo[l].length-1; c++){
                triangulo[l][c] = triangulo[l-1][c-1] + triangulo[l-1][c];
            }
        }

        for(int l = 0; l< triangulo.length; l++){
            for(int c = 0; c < triangulo[l].length; c++){
                System.out.print(triangulo[l][c] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
