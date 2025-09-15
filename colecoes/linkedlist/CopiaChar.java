package linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Iterator;

public class CopiaChar {
    public static void main(String[] args) {
        LinkedList<Character> listaChar = new LinkedList<>(Arrays.asList('J','H','O','A','N','C','R','7','T','O','P'));

        LinkedList<Character> copia = new LinkedList<>();
        Iterator<Character> inversao = listaChar.iterator();

        while (inversao.hasNext()) {
            copia.addFirst(inversao.next());
        }

        System.out.println(copia);

        
    }
}
