package reuso.equipamentos;

public class Computador extends Equipamento {
    private String processador;
    private int quantidadedMemoria;

    public Computador(String marca, String modelo, String processador, int quantidadedMemoria) {
        super(marca, modelo);
        this.processador = processador;
        this.quantidadedMemoria = quantidadedMemoria;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setQuantidadedMemoria(int quantidadedMemoria) {
        this.quantidadedMemoria = quantidadedMemoria;
    }

    public String getProcessador() {
        return processador;
    }

    public int getQuantidadedMemoria() {
        return quantidadedMemoria;
    }

    @Override
    public String toString() {
        String res = super.toString();
        res += "Processador: " + processador + "\n";
        res += "Memoria: " + quantidadedMemoria + "GB\n";
        return res;
    }
}
