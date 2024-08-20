package caixa;

class CaixaBanco {
    private int numeroCaixa;
    public static int clientesAtendidos = 0;

    public CaixaBanco(int numeroCaixa) {
        this.numeroCaixa = numeroCaixa;
    }

    public void iniciaAtendimento() {
        System.out.println("Caixa " + numeroCaixa + " atendendo cliente " + (++clientesAtendidos));
    }

}