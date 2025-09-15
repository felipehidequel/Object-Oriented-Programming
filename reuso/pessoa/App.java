package reuso.pessoa;

public class App {
    public static void main(String[] args) {
        Politico prefeito = new Prefeito("Wendel Largatixa", "08701988409", "PT", "Piloẽs/RN");
        Politico governador = new Governador("Fatima Bezerra", "999999999", "PT", "RN");

        System.out.println(prefeito);
        System.out.println();
        System.out.println(governador);
    }
}
