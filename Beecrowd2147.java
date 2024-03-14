import java.util.Scanner;

public class Beecrowd2147 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nCases = sc.nextInt();

        for (int i = 0; i < nCases; i++) {

            String galopeira = sc.next();

            double time = (double) galopeira.length() /100;
            System.out.printf("%.2f%n", time);
        }
    }
}
