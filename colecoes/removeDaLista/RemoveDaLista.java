package removeDaLista;

import java.util.Arrays;
import java.util.LinkedList;

public class RemoveDaLista {
    public static void remove(LinkedList<String> listaOriginal, LinkedList<String> remover) {
        remover.listIterator().forEachRemaining(listaOriginal::remove);
    }

    
    public static void main(String[] args) {
        LinkedList<String> listaOriginal = new LinkedList<String>();
        listaOriginal.add("Vermelho");
        listaOriginal.add("Azul");
        listaOriginal.add("Verde");
        listaOriginal.add("Amarelo");
        listaOriginal.add("Preto");
        listaOriginal.add("Branco");

        System.out.println(listaOriginal);
        LinkedList<String> listaCopia = new LinkedList(Arrays.asList("Amarelo", "Preto", "Branco"));
        remove(listaOriginal, listaCopia);
        System.out.println(listaOriginal);
    }
}
