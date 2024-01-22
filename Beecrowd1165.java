import java.util.Scanner;

public class Beecrowd1165 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();
            int cont = 0;

            for (int j = 1; j <= x; j++) {
                if (x % j == 0) {
                    cont++;
                }
            }

            if (cont == 2) {
                System.out.printf("%d eh primo%n", x);
            }   else {
                System.out.printf("%d nao eh primo%n", x);
            }
        }
    }
}
