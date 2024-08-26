
class Tarefa {
    private int id;
    private String nome;
    private String descricao;
    private Boolean concluida;

    public Tarefa(int id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getConcluida() {
        return concluida;
    }

    public void setStatus() {
        this.concluida = true;
    }

    @Override
    public String toString() {
        return this.nome + " - " + (concluida ? "Concluida" : "Pendente");
    }
}