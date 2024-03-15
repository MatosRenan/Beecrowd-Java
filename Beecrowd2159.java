import java.util.Scanner;

public class Beecrowd2159 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double minimum = n/Math.log(n);
        double maximum = n * 1.25506/Math.log(n);
        System.out.printf("%.1f %.1f%n", minimum, maximum);
    }
}
