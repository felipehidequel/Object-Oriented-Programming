package abstrata.animal;

public class App {
    public static void main(String[] args){
        Peixe p = new Peixe("Nemo");
        Cachorro c = new Cachorro("Rex");
        Formiga f = new Formiga();
        
        p.caminha();
        p.come();
        p.brincar();
        
        c.caminha();
        c.come();
        c.brincar();
        
        f.caminha();
        f.come();
    }
}
