package extrato;

import java.util.ArrayList;

public class Extrato {
    private double saldoFinal;
    private ArrayList<Double> transacoes;

    public Extrato() {
        this.saldoFinal = 0.0;
        transacoes = new ArrayList<Double>();

    }

    public void transacao(double valor) {
        if (saldoFinal + valor >= 0) {
            saldoFinal += valor;
            transacoes.add(valor);
        }
    }

    public void visualizar() {
        System.out.println("Saldo final: " + saldoFinal);
        System.out.println("Transações: ");
        for (Double transacao : transacoes) {
            System.out.println(transacao);
        }
    }
}
