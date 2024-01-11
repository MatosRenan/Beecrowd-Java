import java.util.Scanner;

public class Beecrowd1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            double x1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double x3 = sc.nextDouble();

            double average = (x1 * 2 + x2 * 3 + x3 * 5)/10;

            System.out.printf("%.1f", average);
        }
    }
}
