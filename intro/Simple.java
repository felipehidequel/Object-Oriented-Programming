import java.util.Scanner;

public class Simple {
    public int sum(int a, int b){
        return a + b;
    }

    public static void main(String[] args){
        Simple s = new Simple();
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        int result = s.sum(a, b);
        System.out.println("The sum is: " + result);
    }
}
