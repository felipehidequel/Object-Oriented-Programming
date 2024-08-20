package extrato;

public class demoExtrato {
    public static void main(String args[]){
        Extrato extrato = new Extrato();
        extrato.transacao(100);
        extrato.transacao(-12);
        extrato.visualizar();
    }

}
