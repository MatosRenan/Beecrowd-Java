import java.math.BigInteger;
import java.util.Scanner;

public class Beecrowd2867 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int xTests = sc.nextInt();

        for (int i = 0; i < xTests; i++) {

            int n = sc.nextInt();
            int m = sc.nextInt();
            BigInteger result = BigInteger.valueOf(n).pow(m);

            String x = String.valueOf(result);
            System.out.println(x.length());
        }
    }
}
