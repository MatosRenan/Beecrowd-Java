public class Beecrowd1155 {
    public static void main(String[] args) {

        double s = 1;

        for (int i = 2; i <= 100; i++) {
            s = s + ((double) 1 / i);
        }

        System.out.printf("%.2f%n", s);
    }
}
