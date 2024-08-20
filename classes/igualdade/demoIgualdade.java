package igualdade;

public class demoIgualdade {
    public static void main (String[] args){
        Integer a = 10;
        // Integer b = 10;
        int b = 10;
        System.out.println(Igualdade.ehIgual(a, b));

        String c = "Hello";
        String d = "Hello";
        System.out.println(Igualdade.ehIgual(c, d));
    }
}
