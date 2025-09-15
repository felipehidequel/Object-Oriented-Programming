import java.util.ArrayList;

public class Cores {
    public void estahNaLista(ArrayList<String> lista, String alvo) {

        if (lista.contains(alvo)) {
            // lista.indexOf(alvo);
            System.out.println(alvo + " está na lista na posição " + lista.indexOf(alvo));
        } else {
            System.out.println(alvo + " não está na lista");
        }

    }

    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<String>();
        cores.add("Vermelho");
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Amarelo");
        cores.add("Preto");
        cores.add("Branco");

        System.out.println(cores);
        cores.sort(null);
        System.out.println(cores);

        Cores c = new Cores();
        c.estahNaLista(cores, "Azul");
        c.estahNaLista(cores, "Roxo");

    }

}