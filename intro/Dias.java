import java.util.Scanner;

public class Dias {

    String minutosToDias(int minutos) {
        // 9257 minutos = 6 dias 10 horas 17 minutos

        int dias = minutos / 1440;
        int horas = (minutos % 1440) / 60;
        int minutosResto = minutos % 60;
        
        return dias + " dias " + horas + " horas " + minutosResto + " minutos";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digito um intervalo em minutos: ");
        int minutos = sc.nextInt();
        Dias d = new Dias();
        System.out.println(d.minutosToDias(minutos));

        sc.close();
    }
}
