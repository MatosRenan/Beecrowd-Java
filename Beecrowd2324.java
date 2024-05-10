import java.math.BigInteger;
import java.util.Scanner;

public class Beecrowd2324 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nDucks = sc.next();

        while (!(nDucks.equals("-1"))) {

            BigInteger numberToSubtract = BigInteger.ONE;

            // Define the number from which you want to subtract
            BigInteger ducks = new BigInteger(nDucks);

            // Subtract the number using the subtract method
            BigInteger result = ducks.subtract(numberToSubtract);

            if (nDucks.equals("0")) {
                System.out.println(0);
            }   else {
                System.out.println(result);
            }

            nDucks = sc.next();
        }


    }
}
