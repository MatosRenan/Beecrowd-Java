import java.util.Scanner;

public class Beecrowd3091 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        int rest = 0;

        while (dividend >= 0) {
            rest = dividend;
            dividend -= divisor;
        }
        System.out.println(rest);
    }
}
