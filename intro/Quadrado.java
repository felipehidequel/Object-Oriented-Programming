import java.util.Scanner;

public class Quadrado {
    double lado;
    double area() {
        return lado * lado;
    }

    public static void main(String[] args) {
        Quadrado q = new Quadrado();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado:");
        q.lado = sc.nextDouble();
        sc.close();

        System.out.println("Area do quadrado: " + q.area());
    }
}
