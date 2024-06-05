import java.util.Scanner;

public class Data {
    
    public static void main(String[] args){
        int dd, mm, aaaa;
        String dataFormatada;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        dd = sc.nextInt();
        System.out.print("Digite o mês: ");
        mm = sc.nextInt();
        System.out.print("Digite o ano: ");
        aaaa = sc.nextInt();

        dataFormatada = dd + " de ";
        if(mm == 1){
            dataFormatada += "Janeiro";
        } else if (mm == 2){
            dataFormatada += "Fevereiro";
        } else if (mm == 3){
            dataFormatada += "Março";
        } else if (mm == 4){
            dataFormatada += "Abril";
        } else if (mm == 5){
            dataFormatada += "Maio";
        } else if (mm == 6){
            dataFormatada += "Junho";
        } else if (mm == 7){
            dataFormatada += "Julho";
        } else if (mm == 8){
            dataFormatada += "Agosto";
        } else if (mm == 9){
            dataFormatada += "Setembro";
        } else if (mm == 10){
            dataFormatada += "Outubro";
        } else if (mm == 11){
            dataFormatada += "Novembro";
        } else {
            dataFormatada += "Dezembro";
        }

        dataFormatada += " de " + aaaa;
        System.out.println(dataFormatada);

        int qtdDias = 0;
        switch(mm) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                qtdDias = 31;
                break;
            case 2:
                qtdDias = 28;
                break;
        
            default:
                qtdDias = 30;
                break;
        }
        
        System.out.println("O mês " + mm + " tem " + qtdDias + " dias.");
        
        sc.close();
    }
    
}
