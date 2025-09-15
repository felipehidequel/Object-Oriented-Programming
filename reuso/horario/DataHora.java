package reuso.horario;

/*
 * Crie uma classe para representar uma data e um horário (DataHora).
• Escreva uma classe EventoDelegacao que seja baseada na classe DataHora e que
contenha um campo para indicar qual o evento que ela representa (use uma String
para isto). Use o mecanismo de delegação para criar a classe EventoDelegacao;
• Escreva uma classe EventoHeranca que seja baseada na classe DataHora e que
contenha um campo para indicar qual o evento que ela representa (use uma String
para isto). Use o mecanismo de herança para criar a classe EventoHeranca;
• Escreva um aplicativo de teste que demonstre o uso das classes criadas.
 */

public class DataHora {
    private int dia;
    private int mes;
    private int ano;
    private String hora;

    public DataHora(int dia, int mes, int ano, String hora) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getHora() {
        return hora;
    }

    @Override
    public String toString() {
        String res = dia + "/" + mes + "/" + ano;
        res += "\n"+hora;
        return res;
    }
}
