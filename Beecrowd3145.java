import java.util.Scanner;

public class Beecrowd3145 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dwarves = sc.nextInt();
        double distance = sc.nextDouble();
        double days = (dwarves + 2)/distance;
        System.out.printf("%.2f\n", days);
    }
}
