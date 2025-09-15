package ExemploPilha;

import java.util.Stack;

public class ExemploPilha {
    public static void main(String[] args) {
        Stack<Number> pilha = new Stack<Number>();

        pilha.push(1);
        pilha.push(3.5);
        pilha.push(6.54F);
        System.out.println(pilha);

      for(int i=0; i < pilha.size(); i++){
          System.out.println(pilha.pop());
      }
    
    }
}
