import java.util.Scanner;

public class Beecrowd1074 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String evenOdd;
        String posNeg;
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            int x = input.nextInt();

            if (x == 0) {
                System.out.println("NULL");
            } else {
                if (x > 0) {
                    posNeg = "POSITIVE";
                }   else {
                    posNeg = "NEGATIVE";
                }
                if (x % 2 != 0) {
                    evenOdd = "ODD";
                }   else {
                    evenOdd = "EVEN";
                }
                System.out.printf("%s %s%n", evenOdd, posNeg);
            }

        }

    }
}
