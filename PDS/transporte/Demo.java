package transporte;

import java.util.Scanner;

public class Demo {
    public static void main(String args[]){
        Carro carro1 = new Carro("Fiat", "Uno", "Vermelho");
        Moto moto = new Moto("honda", "titan", "preta");
        Caminhao caminhao = new Caminhao("volvo", "FH", "branco");

        Scanner sc = new Scanner(System.in);
        carro1.print();
        moto.print();
        caminhao.print();


        System.out.println("Digite a marca, modelo e cor para o carro: ");
        String marca, modelo, cor;

        marca = sc.nextLine();
        modelo = sc.nextLine();
        cor = sc.nextLine();

        carro1.setMarca(marca);
        carro1.setModelo(modelo);
        carro1.setCor(cor);
        // carro1.cor = "azul";
        System.out.println("Informe os dados para moto:");

        moto.marca = sc.nextLine();
        moto.modelo = sc.nextLine();
        moto.cor = sc.nextLine();

        System.out.println("Informe os dados para caminhão:");


        marca = sc.nextLine();
        modelo = sc.nextLine();
        cor = sc.nextLine();

        caminhao.setMarca(marca);
        caminhao.setModelo(modelo);
        caminhao.setCor(cor);

        carro1.print();
        moto.print();
        caminhao.print();
    }
}
