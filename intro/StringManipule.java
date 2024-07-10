public class StringManipule {
    public static void main(String[] args) {
        String nome = "Felipe";
        System.out.println("O nome " + nome + " tem " + nome.length() + " letras.");
        System.out.println(nome.toUpperCase());
        String nome2 = nome.toLowerCase();
        System.out.println(nome2.equals(nome2));
    }
}
