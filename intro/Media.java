import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        double n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        n1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        n3 = sc.nextDouble();

        System.out.println("A média é: " + media(n1, n2, n3));
    }

    public static double media(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
}