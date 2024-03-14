import java.util.Scanner;

public class Beecrowd2146 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int n = sc.nextInt();

            if (n >= 1001 && n <= 9999) {
                System.out.println(n - 1);
            }
        }
    }
}
