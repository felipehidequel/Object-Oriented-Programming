import java.util.Scanner;

public class MediaAritmetica {
    double nota1=0,nota2=0,nota3=0;
    
    double soma(){
        return nota1 + nota2 + nota3;
    }

    double media(){
        return soma() / 3;
    }

    public static void main(String[] args){
        MediaAritmetica m = new MediaAritmetica();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe as 3 notas do aluno: ");
        m.nota1 = sc.nextDouble();
        m.nota2 = sc.nextDouble();
        m.nota3 = sc.nextDouble();
        sc.close();
        
        System.out.println("A soma das notas do aluno é: " + m.soma() +
        " e a Média aritmetica do aluno é: " + m.media());
        
        
    }
}