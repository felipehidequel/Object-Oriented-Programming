public class Velocidades {
    public static void main(String[] args) {
        double kph, mps, mph, pps;

        kph = 0.0;

        System.out.println("KPH\tMPS\tMPH\tPPS");
        while (kph <= 50.0) {
            mps = kph * 0.2778;
            mph = kph * 0.6214;
            pps = kph * 0.9114;
            String format_Table = String.format("%.2f\t%.2f\t%.2f\t%.2f", kph, mps, mph, pps);
            System.out.println(format_Table);
            kph += 0.5;
        }

    }
}
