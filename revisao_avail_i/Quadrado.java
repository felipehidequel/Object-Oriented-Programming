import java.util.Scanner;

/**
 * Quadrado
 */
public class Quadrado {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int lado;
        System.out.print("Informe o lado do quadrado: ");
        lado = sc.nextInt();
        sc.close();

        System.out.println("A area do quadrado é: "+ lado*lado);


    }
    
}