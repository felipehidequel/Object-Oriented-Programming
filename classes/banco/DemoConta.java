package classes.banco;

public class DemoConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta("João", 1000.0, true);
        Conta conta2 = new Conta("Maria");

        System.out.println(conta1);
        System.out.println();
        System.out.println(conta2);
    }
}
