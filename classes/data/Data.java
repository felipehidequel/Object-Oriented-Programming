package classes.data;

public class Data {
    int dia;
    int mes;
    int ano;

    public boolean dataEhValida() {
        if ((dia < 1 || dia > 31) && (mes < 1 || mes > 12) && (ano < 1)) {
            return false;
        }
        return true;
    }

    public void inicializaData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void mostraData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
