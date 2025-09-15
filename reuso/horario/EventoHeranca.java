package reuso.horario;

/**
 * EventoHeranca
 */
public class EventoHeranca extends DataHora {
    private String local;

    public EventoHeranca(int dia, int mes, int ano, String hora, String local) {
        super(dia, mes, ano, hora);
        this.local = local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    @Override
    public String toString() {
        String res = local + "\n";
        res += super.toString();
        return res;
    }

}