package produto;

public class Produto {
    public static void main(String[] args) {
        System.out.println(produto(1, 2 , 3 ,4));
        System.out.println(produto(2,3));
    }

    public static int produto(int... produtos) {
        int res = 1;

        for (int i : produtos) {
            res *= i;
        }

        return res;
    }
}
