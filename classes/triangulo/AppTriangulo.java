package classes.triangulo;

public class AppTriangulo {
    public static void main(String[] args) {
        Triangulo t2, t3 = new Triangulo();
        Triangulo t1 = new Triangulo(3, 4, 5, "Retângulo");
        t2 = t1;
        System.out.println(t1 == t2);
        System.out.println(t1 == t3);

    }
}
