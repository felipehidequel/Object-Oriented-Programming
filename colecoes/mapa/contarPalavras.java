package mapa;

import java.util.TreeMap;

public class contarPalavras {
    public static void main(String[] args) {
        String texto = "Lorem ipsum dolor sit amet consectetur adipiscing elit Quisque lobortis elit ut elementum interdum enim ex placerat ante in suscipit felis nisi sit amet diam Ut consequat ac massa eu congue Nulla non nulla et nisi fermentum molestie in ut dolor Donec elementum ligula quis rutrum pharetra ante diam fringilla dui et faucibus massa odio et massa Nunc non risus nisi Pellentesque magna massa pretium ut tempus id auctor porta lacus Sed nec sodales metus et hendrerit turpis Praesent est tellus pharetra eu dolor eu lacinia tristique lacus Ut ut metus ante Cras nec nibh id mauris rhoncus consectetur Phasellus a eros dignissim elementum nisi non consequat magna";

        String[] palavras = texto.split(" ");
        TreeMap<String, Integer> mapa = new TreeMap<String, Integer>();

        for (String palavra : palavras) {
            if (mapa.containsKey(palavra)) {
                mapa.put(palavra, mapa.get(palavra) + 1);
            } else {
                mapa.put(palavra, 1);
            }
        }


        for (String chave : mapa.keySet()) {
            System.out.println(chave + " = " + mapa.get(chave));
        }
    }
}
