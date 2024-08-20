package reuso.empresa;

public class DemoEmpresa {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Felipe", "32421", 1000);
        GerenteDeDepartamento g = new GerenteDeDepartamento("João", "12345", 2000, "TI");
        System.out.println(f);

        System.out.println(g);
    }
}
