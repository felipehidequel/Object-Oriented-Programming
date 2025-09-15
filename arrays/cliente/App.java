package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int id;
        String nome;
        int idade;
        String telefone;
        Boolean sair = false;

        do {
            System.out.println("Para terminar as operações, digite o numero de id negativo");
            System.out.print("Informe id: ");
            id = sc.nextInt();
            sc.nextLine();
            if (id > 0) {
                System.out.print("Nome: ");
                nome = sc.nextLine();
                System.out.print("Idade: ");
                idade = sc.nextInt();
                sc.nextLine();
                System.out.print("Telefone: ");
                telefone = sc.nextLine();

                clientes.add(new Cliente(id, nome, idade, telefone));
            } else {
                sair = true;
            }
        } while (!sair);


        for (Cliente c : clientes) {
            System.out.println(c);
        }

        sc.close();
    }
}
