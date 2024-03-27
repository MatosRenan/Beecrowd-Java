import java.util.Scanner;

public class Beecrowd2166 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sqrt = 0;

        for (int i = 0; i < n; i++) {

            sqrt += 2;
            sqrt = (1.0/sqrt);
        }
        sqrt += 1;
        System.out.printf("%.10f%n", sqrt);
    }
}
