import java.util.Scanner;

public class Beecrowd1963 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double previousPrice = sc.nextDouble();
        double currentPrice = sc.nextDouble();
        double increase;

        increase = 100 * currentPrice / previousPrice;
        System.out.printf("%.2f%%%n", increase - 100);
    }
}
