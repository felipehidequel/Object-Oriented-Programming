import java.util.Scanner;
import java.util.Calendar;

public class ValidaCartao {
    public static void main(String[] args) {
        String nome, numero, cod;
        int mm, aaaa;
        boolean expirado = false;
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        int mesAtual = cal.get(Calendar.MONTH) + 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do titular: ");
        nome = sc.nextLine();
        System.out.print("Digite o número do cartão: ");
        numero = sc.nextLine();
        System.out.print("Digite o código de segurança: ");
        cod = sc.next();
        do {
            System.out.print("Digite o mês de validade: ");
            mm = sc.nextInt();
            System.out.print("Digite o ano de validade: ");
            aaaa = sc.nextInt();
            expirado = !((aaaa > anoAtual) || (aaaa == anoAtual && mm >= mesAtual));
            if (expirado) {
                System.out.println("Cartão expirado! Informe validade correta!");
            }
        } while (expirado);
        System.out.println("Os dados são validos!");

        sc.close();
    }
}
