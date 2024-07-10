import java.util.Scanner;

public class UnidadeAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println(CDUtoUCD(n));
    }

    public static String CDUtoUCD(int CDU) {
        int U = CDU % 10; // extrair a unidade
        CDU = (CDU - U) / 10; // elimina a unidade do numero
        int D = CDU % 10; // extraindo a dezena
        CDU = (CDU - D) / 10; // elimina a dezena do numero
        int C = CDU; // eliminando a dezena, sobra a centena

        return (U + "" + D + "" + C);
    }
}
