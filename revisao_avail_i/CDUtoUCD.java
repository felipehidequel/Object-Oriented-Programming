public class CDUtoUCD {
    public static void main(String[] args) {
        System.out.println("Informe um numero de 3 digitos");
        int num = 123;
        int c = num / 100;
        int d = (num % 100) / 10;
        int u = num % 10;
        System.out.println(u + ""+ d + ""+c);

        System.out.println("minutos pra dias e horas e minutos");
        int minutos = 9257;
        int dias = minutos / (24*60);
        int resto = minutos % (24*60);
        int horas = resto / 60;
        int resto_horas = resto % 60;
        System.out.println(dias + " dias, " + horas + " horas e " + resto_horas + " minutos");
    }
}
