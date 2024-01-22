import java.util.Scanner;

public class Beecrowd1164 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int j = 0; j < n; j++) {
            int x = sc.nextInt();
            int sum = 0;

            for (int i = 1; i < x; i++) {

                if (x % i == 0) {
                    sum += i;
                }

            }

            if (sum == x) {
                System.out.printf("%d eh perfeito%n", x);
            } else {
                System.out.printf("%d nao eh perfeito%n", x);
            }

        }
    }
}
