package banco;
class ContaBancaria {
    private double saldo;
    private String nome;
    private String cpf;

    public ContaBancaria(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    public void print() {
        Logg.info("Nome: " + this.nome);
        Logg.info("CPF: " + this.cpf);
        Logg.info("Saldo: " + this.saldo);
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo < valor) {
            Logg.warning("Saldo insuficiente!");
            Logg.info("Saldo atual: " + this.saldo);
            return;            
        }
        this.saldo -= valor;
    }

}