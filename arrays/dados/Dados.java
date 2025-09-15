package dados;

import java.util.Random;

public class Dados {
    public static void main(String[] args) {
        int[] lancamentoDados = new int[13];
        int dado1, dado2;
        for (int i : lancamentoDados) {
            i = 0;
        }

        for (int i = 0; i < 36000000; i++) {
            dado1 = lancarDados();
            dado2 = lancarDados();
            lancamentoDados[dado1 + dado2]++;
        }

        System.out.println("Quantidade de vezes que o dados cairam em:");
        for (int i = 2; i < lancamentoDados.length; i++) {
            System.err.println(i + " : " + lancamentoDados[i]);
        }
    }

    public static int lancarDados() {
        Random res = new Random();
        return res.nextInt((6 - 1) + 1) + 1;
    }
}
