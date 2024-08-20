package tupla;

public class Tupla<T, S> {
    private T primeiro;
    private S segundo;

    public Tupla(T primeiro, S segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    public void setPrimeiro(T primeiro) {
        this.primeiro = primeiro;
    }

    public void setSegundo(S segundo) {
        this.segundo = segundo;
    }

    public T getPrimeiro() {
        return primeiro;
    }

    public S getSegundo() {
        return segundo;
    }

    public String toString() {
        return "(" + primeiro + ", " + segundo + ")";
    }
}
