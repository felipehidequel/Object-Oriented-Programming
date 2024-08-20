import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        int num, fat=1;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        do{

            for (int i = num; i>1; i--)
                fat *= i;
            
            System.out.println("O fatorial de " + num + " é " + fat + ".");
            num--;
            fat=1;
        }while(num >= 0);
        sc.close();
    }
}
