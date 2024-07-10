package classes.triangulo;

public class Triangulo {
    double lado1, lado2, lado3;
    String descricao;

    public Triangulo(){};

    public Triangulo(double lado1, double lado2, double lado3, String descricao) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.descricao = descricao;
    }

    double perimetro() {
        return lado1 + lado2 + lado3;
    }

}
