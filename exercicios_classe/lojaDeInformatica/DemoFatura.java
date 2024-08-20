package exercicios_classe.lojaDeInformatica;

public class DemoFatura {
    public static void main(String[] args) {
        Fatura f1 = new Fatura("123", "Mouse", 5, 10.0);
        double valorFatura = f1.getValorFatura();
        System.out.println("Valor da fatura: " + valorFatura);
    }
}
