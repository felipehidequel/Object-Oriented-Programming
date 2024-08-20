package abstratas.controle;

public class demoControle {
   public static void l(String s) {
        System.out.println(s);
    }

    public static void main(String args[]) {
        Aviao a = new Aviao(100, "1234", "1234");
        Carro t = new Carro(5, 4, "1234");
        Barco b = new Barco(100, 10, "1234");

        // t.moverFrente();
        // b.moverFrente();
        // a.moverFrente();

        Controle c = new Controle();
        c.controlar(a);
        c.controlar(t);
        c.controlar(b);

        l(a.toString());
    }
}
