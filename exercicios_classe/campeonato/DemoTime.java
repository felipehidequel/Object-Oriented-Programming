package exercicios_classe.campeonato;

public class DemoTime {

    public static void main(String[] args) {
        Time t1 = new Time("Flamengo", "Futebol", 100, 10);
        t1.mostraTime();

        t1.ganhouJogo(3);
        System.out.println("----");
        t1.mostraTime();
        System.out.println("----");
        t1.perdeuJogo(0);
        t1.mostraTime();
    }
}