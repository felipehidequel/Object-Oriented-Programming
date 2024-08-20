package pessoa;

public class DemoPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 1.75);
        
       String s1 = pessoa1.toString();
       System.out.println(s1);
       System.out.println();
       System.out.println(pessoa1);
    }
}
