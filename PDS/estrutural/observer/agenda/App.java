


public class App {
    public static void main(String[] args) {
        ListaDeTarefas tarefas = new ListaDeTarefas();

        tarefas.addObserver(new TarefaObserver());

        tarefas.adicionarTarefa("Corinthians", "Assistir o jogo do corinthians");
        System.out.println("------------------------------------------------------");
        tarefas.adicionarTarefa("Missa", "Ir pra missa");

        tarefas.concluirTarefa(0);
    }
}
