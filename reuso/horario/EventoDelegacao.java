package reuso.horario;

/**
 * EventoDelegacao
 */
public class EventoDelegacao {
    private DataHora horario;
    private String local;

    public EventoDelegacao(int dia, int mes, int ano, String hora, String local){
        horario = new DataHora(dia, mes, ano, hora);
        this.local = local;
    }

    public void setHorario(DataHora horario) {
        this.horario = horario;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public DataHora getHorario() {
        return horario;
    }

    public String getLocal() {
        return local;
    }

    @Override
    public String toString() {
        String res = local + "\n";
        res += horario.toString();
        return res;
    }
    
}