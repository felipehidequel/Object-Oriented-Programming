package Agenda;

public class EntradaEmAgenda {
    private String hora;
    private int dia, mes, ano;
    private String assunto;

    public EntradaEmAgenda(String hora, int dia, int mes, int ano, String assunto) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    public String getHora() {
        return hora;
    }

    public int getAno() {
        return ano;
    }

    public String getAssunto() {
        return assunto;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String toString() {

        String data = dia + "/" + mes + "/" + ano;

        return data + " " + hora + "\n" + assunto;
    }

    boolean ehNoDia(int dia, int mes, int ano) {
        return ((this.dia == dia) && (this.mes == mes) && (this.ano == ano));
    }
}
