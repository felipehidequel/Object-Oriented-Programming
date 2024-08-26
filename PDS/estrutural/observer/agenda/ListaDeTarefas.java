import java.util.ArrayList;

class ListaDeTarefas implements Observable {
    private ArrayList<Tarefa> tarefas;
    private ArrayList<Observer> observers;

    ListaDeTarefas() {
        tarefas = new ArrayList<Tarefa>();
        observers = new ArrayList<Observer>();
    }

    void adicionarTarefa(String nome, String descricao) {
        int id = tarefas.size();
        tarefas.add(new Tarefa(id, nome, descricao));
        notifyObservers();
    }

    void concluirTarefa(int taredaId) {
        for (Tarefa tarefa : tarefas) {
            if (taredaId == tarefa.getId()) {
                tarefa.setStatus();
                notifyObservers();
            }
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer))
            observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer t : observers) {
            t.update();
        }
        listarTarefas();
    }

    public void listarTarefas(){
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }
}