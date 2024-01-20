public class Beecrowd1156 {
    public static void main(String[] args) {

        double s = 1;
        double dividend = 3;
        double divisor = 2;

        while (dividend <= 39) {

            s = s + (dividend/divisor);
            dividend += 2;
            divisor *= 2;
        }

        System.out.printf("%.2f", s);

    }
}
