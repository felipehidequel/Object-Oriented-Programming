public class EmailObserver implements Observer {

    @Override
    public void update() {
        // finja que tem uma logica para enviar emails
        System.out.println("Um email foi enviado para o responsável pela tarefa!");
    }
    
}
