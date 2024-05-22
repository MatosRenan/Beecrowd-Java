import java.util.Scanner;

public class Beecrowd3146 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        double size = 2 * 3.14 * radius;
        System.out.printf("%.2f\n", size);
    }
}
