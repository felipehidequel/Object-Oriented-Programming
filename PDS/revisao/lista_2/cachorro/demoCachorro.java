package cachorro;

public class demoCachorro {
    public static void  main(String args[]){
        // questão 1
        Cachorro c1 = new Cachorro("Apollo", "Pastor Alemão", 3);
        Cachorro c2 = new Cachorro("Kira", "Poodle", 2);
        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c2.equals(c1));
        c2 = c1.clonarCachorro();

        System.out.println(c2.equals(c1));


        // questão 2

        Cachorro c3 = new Cachorro();
        System.out.println(c3);

        c3.setNome("Geraldo");
        c3.setRaca("Shi-tzu");
        c3.setIdade(8);

        System.out.println(c3);
    }
}
