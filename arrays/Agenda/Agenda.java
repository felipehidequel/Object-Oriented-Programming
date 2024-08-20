package Agenda;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> compromissos;

    public Agenda() {
        compromissos = new ArrayList<EntradaEmAgenda>();
    }

    public void criarCompromisso(String hora, int dia, int mes, int ano, String assunto) {
        EntradaEmAgenda compromisso = new EntradaEmAgenda(hora, dia, mes, ano, assunto);
        compromissos.add(compromisso);
    };

    public void listaDia(int dia, int mes, int ano) {
        for (EntradaEmAgenda i : compromissos) {
            if (i.ehNoDia(dia, mes, ano)) System.out.println(i);
        }
    }
}
