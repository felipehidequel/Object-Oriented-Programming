import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        float x1,x2,y1,y2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coordinates of the first point: (x1 y1)");
        x1 = sc.nextFloat();
        y1 = sc.nextFloat();

        System.out.println("Enter the coordinates of the second point: (x2 y2)");
        x2 = sc.nextFloat();
        y2 = sc.nextFloat();

        sc.close();

        float distance = (float) Math.sqrt(Math.pow(x2 - x1, 2) + 
        Math.pow(y2 - y1, 2));
        
        System.out.println("The distance between the two points is: " + distance);
    }
}
