public class TarefaObserver implements Observer {

    @Override
    public void update() {
        System.out.println("Uma tarefa foi atualizada na lista!");
    }

}
