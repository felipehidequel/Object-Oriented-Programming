


public class App {
    public static void main(String[] args) {
        // criado uma lista de tarefas
        ListaDeTarefas tarefas = new ListaDeTarefas();

        // nossa main adiciona um observador
        TarefaObserver view = new TarefaObserver();
        EmailObserver email = new EmailObserver();
        tarefas.addObserver(view);
        tarefas.addObserver(email);

        // adicionando tarefas
        tarefas.adicionarTarefa("Corinthians", "Assistir o jogo do corinthians");
        System.out.println("------------------------------------------------------");
        tarefas.adicionarTarefa("Missa", "Ir pra missa");

        tarefas.concluirTarefa(0);
    }
}
