import java.util.Scanner;

public class ConvertCelsiu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe a temperatura em celsius: ");
        double tempCelsiu = sc.nextDouble();

        double fah = (tempCelsiu * 1.8) + 32;
        System.out.println(tempCelsiu + "°C - " + fah + "°F");
    }
}
