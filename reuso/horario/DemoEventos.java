package reuso.horario;

public class DemoEventos {
    public static void main(String[] args) {
        EventoDelegacao eventoDelegacao = new EventoDelegacao(2, 12, 2001, "00:00", "Alexandria RN");

        EventoHeranca eventoHeranca = new EventoHeranca(2, 12, 2001, "00:00", "Alexandria RN");

        System.out.println(eventoDelegacao);
        System.out.println();
        System.out.println(eventoHeranca);
    }
}
