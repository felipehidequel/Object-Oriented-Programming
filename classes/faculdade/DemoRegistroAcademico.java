package classes.faculdade;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico r1 = new RegistroAcademico();
        r1.inicializaRegistroAcademico("João", "123", 1, 0.5);
        System.out.println("Mensalidade: " + r1.calculaMensalidade());
    }
}
