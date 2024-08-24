package banco;
public class Logg {
    public static void info(String message) {
        System.out.println("\u001B[32m" + "[SISTEMA] " + "\u001B[0m" + message);
    }

    public static void warning(String message) {
        System.out.println("\u001B[33m" + "[SISTEMA] " + "\u001B[0m" + message);
    }
}
