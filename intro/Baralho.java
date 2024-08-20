/*
 * Escreva um programa que lê um número que representa o valor da carta, de um (ás) a
 * treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4 =
 * espadas). O programa deve imprimir o nome da carta por extenso.
 * 
 */

import java.util.Scanner;

public class Baralho {

    public static void main(String args[]) {
        int valor, naipe;
        String valorEx = "", naipeEx = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Infome o valor da carta e o naipe: ");
        valor = sc.nextInt();
        naipe = sc.nextInt();

        switch (valor) {
            case 1:
                valorEx = "Ás";
                break;
            case 2:
                valorEx = "Dois";

                break;
            case 3:
                valorEx = "Três";

                break;
            case 4:
                valorEx = "Quatro";

                break;
            case 5:
                valorEx = "Cinco";

                break;
            case 6:
                valorEx = "Seis";

                break;
            case 7:
                valorEx = "Sete";

                break;
            case 8:
                valorEx = "Oito";

                break;
            case 9:
                valorEx = "Nove";

                break;
            case 10:
                valorEx = "Dez";

                break;
            case 11:
                valorEx = "Valete";

                break;
            case 12:
                valorEx = "Rainha";

                break;
            case 13:
                valorEx = "Rei";

                break;

            default:
                valorEx = "Valor errado";
                break;
        }

        switch (naipe) {
            case 1:
                naipeEx = "Ouros";
                break;
            case 2:
                naipeEx = "Paus";

                break;
            case 3:
                naipeEx = "Copas";

                break;
            case 4:
                naipeEx = "Espadas";
                break;

            default:
                naipeEx = "Naipe errado";
                break;
        }

        System.out.println("Carta: " + valorEx + " de " + naipeEx);

        sc.close();
    }

}
