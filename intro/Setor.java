import java.util.Scanner;

public class Setor {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int entrada = 0;
        double valor = 0.0, valorOriginal = 0.0;
        String setor;

        System.out.print("Informe o setor de vendas: ");
        entrada = sc.nextInt();

        if (entrada != 111 && entrada != 222) {
            System.out.println("Entrada invalida!");
            System.exit(1);
        }

        System.out.println("Informe o Preço do produto: ");
        valor = sc.nextDouble();

        sc.close();
        valorOriginal = valor;
        if (entrada == 222) {
            if (valor >= 500) {
                valor -= valor * 0.10;
            }
        }

        if (entrada == 111) {
            if (valor > 100)
                valor -= valor * 0.40;
            if (valor >= 50 && valor <= 100)
                valor -= valor * 0.20;
            else {
                valor -= valor * 0.10;
            }
        }
        setor = entrada == 222 ? "Eletros" : "Cama";
        System.out.println("Preço orignal: " + valorOriginal);
        if (valor < valorOriginal) {
            System.out.println("Preço com desconto: " + valor);
        }
        System.out.println("Setor: " + setor);
    }
}
