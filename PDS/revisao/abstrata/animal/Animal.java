package abstrata.animal;

/**
 * Animal
 */
public abstract class Animal {
    private int pernas;

    public Animal(int pernas) {
        this.pernas = pernas;
    }

    public void caminha(){
        System.out.println("Caminhando com " + pernas + " pernas");
    }

    public void come(){
        System.out.println("Comendo");
    }
    
}
