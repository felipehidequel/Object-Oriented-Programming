public class FatorialRecursivo {
    public static void main(String[] args) {
        System.out.println(fat(5));
    
    }

    public static int fat(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fat(n - 1);
    }
}
