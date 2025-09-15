import java.util.*;

public class Media {
    public static void main(String args[]){
        double num1, num2, num3, num4, media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os 3 valores: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();
        media = (num1 + num2 + num3) / 3;
        System.out.println("A média dos valores é: " + media);
    }
}
