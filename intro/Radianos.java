import java.util.Scanner;

public class Radianos {
    public static void main(String[] args) {

        double graus = 0.0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter with angle: ");
        graus = sc.nextDouble();

        // Tratando os dados
        double radianos = Math.toRadians(graus);
        double sin = Math.sin(radianos);
        double cos = Math.cos(radianos);
        double tan = Math.tan(radianos);
        double acos = Math.acos(cos);
        double asin = Math.asin(sin);
        double atan = Math.atan(tan);
        
        System.out.println(graus + "° to radians: " + String.format("%.4f", radianos));
        System.out.println("Sin: " + String.format("%.4f", sin));
        System.out.println("Cos: " + String.format("%.4f", cos));
        System.out.println("Tan: " + String.format("%.4f", tan));
        System.out.println("Acos: " + String.format("%.4f", acos));
        System.out.println("Asin: " + String.format("%.4f", asin));
        System.out.println("Atan: " + String.format("%.4f", atan));

    }
}
