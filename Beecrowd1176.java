import java.util.ArrayList;
import java.util.Scanner;

public class Beecrowd1176 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long f1, f2, f3 = 0;
        int test = sc.nextInt();
        int pos = 0;

        for (int i = 0; i < test; i++) {
            f1 = 0;
            f2 = 1;
            double n = sc.nextLong();

            if (n == 0) {
                System.out.println("Fib(0) = 0");
            } else if (n == 1) {
                System.out.println("Fib(1) = 1");
            }   else {

                for (int j = 2; j < n + 1; j++) {
                    
                    pos = j;
                    f3 = f1 + f2;
                    f1 = f2;
                    f2 = f3;
                }
                System.out.printf("Fib(%d) = %d%n", pos, f3);
            }
        }
    }
}
