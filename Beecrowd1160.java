import java.util.Scanner;

public class Beecrowd1160 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int pa = sc.nextInt();
            int pb = sc.nextInt();
            double g1 = sc.nextDouble();
            double g2 = sc.nextDouble();
            int years = 0;

            while (pa <= pb && years <= 100) {
                pa += pa * g1 / 100;
                pb += pb * g2 / 100;
                years += 1;

            }
            if (years > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(years + " anos.");
            }
        }
    }
}
