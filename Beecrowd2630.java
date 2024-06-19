import java.util.Scanner;

public class Beecrowd2630 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String approach = sc.next();
            int r = sc.nextInt();
            int g = sc.nextInt();
            int b = sc.nextInt();
            int p = 0;
            switch (approach) {
                case "eye" -> p = (int) (0.3 * r + 0.59 * g + 0.11 * b);
                case "mean" -> p = (r + g + b) / 3;
                case "min" -> {
                    int aux = Math.min(r, g);
                    p = Math.min(aux, b);
                }
                case "max" -> {
                    int aux = Math.max(r, g);
                    p = Math.max(aux, b);
                }
            }
            int count = i + 1;
            System.out.println("Caso #" + count + ": " + p);
        }
    }
}
