package classes.data;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        data.inicializaData(10, 10, 2020);
        
        if (data.dataEhValida()) {
            data.mostraData();
        } else {
            System.out.println("Data inválida");
        }
    }    
}
