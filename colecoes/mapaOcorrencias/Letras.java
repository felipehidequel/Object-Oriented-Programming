package mapaOcorrencias;

import java.util.HashMap;
import java.util.Map;

public class Letras {
    public static void main(String[] args) {
        Map<Character,Integer> letras = new HashMap<Character,Integer>();
        char[] l = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H','I', 'J', 'K', 'L', 'M','N','O','P','Q','R','S','T', 'U','V','X','Z'};
        
        for (char c : l) {
            letras.put(c, 0);
        }

        String nome  = "Felipe";
        nome = nome.toUpperCase();
        char c;
        int value;
        for (int i=0; i<nome.length(); i++){
            c = nome.charAt(i);
            
            value = letras.get(c);
            value++;
            letras.put(c, value);
        }

        System.out.println(letras);
    
    }
}
