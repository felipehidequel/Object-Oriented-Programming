package caixa;

public class DemoCaixa {
    public static void main(String args[]){
        System.out.println(CaixaBanco.clientesAtendidos);
        CaixaBanco c1 = new CaixaBanco(1);
        CaixaBanco c2 = new CaixaBanco(2);
        CaixaBanco c3 = new CaixaBanco(3);
        CaixaBanco c4 = new CaixaBanco(4);



        c1.iniciaAtendimento();
        c2.iniciaAtendimento();
        c3.iniciaAtendimento();
        c2.iniciaAtendimento();
        c3.iniciaAtendimento();
    }
}
