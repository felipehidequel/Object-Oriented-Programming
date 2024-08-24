package banco;
import java.util.Scanner;

public class ContaBancariaDemo {
    public static void main(String[] args)
    {
        ContaBancaria conta = new ContaBancaria("Fulano", "123.456.789-00");
        conta.depositar(1000.0);
        conta.sacar(500.0);
        conta.print();
        conta.sacar(1000.0);


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Imprimir informações da conta");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado:");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    Logg.info("Depósito realizado com sucesso!");
                    break;
                case 2:
                    if (conta.getSaldo() == 0) {
                        Logg.warning("Saldo zerado!");
                        break;
                    }
                    System.out.println("Digite o valor a ser sacado:");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    Logg.info("Saque realizado com sucesso!");
                    break;
                case 3:
                    conta.print();
                    break;
                case 4:
                    Logg.info("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        // scanner.close();
    }
    }



