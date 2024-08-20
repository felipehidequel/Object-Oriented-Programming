import java.util.Scanner;

public class Menor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Digite três numeros inteiros: ");
        a = sc.nextInt();
        int menor = a;
        b = sc.nextInt();
        if (b <= menor)
            menor = b;
        c = sc.nextInt();
        if (c <= menor)
            menor = c;

        System.out.println("Menor: " + menor);

        sc.close();
    }
}
