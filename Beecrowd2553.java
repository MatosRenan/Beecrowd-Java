import java.util.Scanner;

public class Beecrowd2553 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            double numerador = 0, denominador = 0;
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {

                int ni = sc.nextInt();
                int ci = sc.nextInt();

                numerador += ni * ci;
                denominador += ci;
            }

            denominador *= 100;
            System.out.printf("%.4f\n", numerador/denominador);
        }
    }
}
