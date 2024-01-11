import java.util.Scanner;

public class Beecrowd1076 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i < 11; i++) {

            System.out.printf("%d x %d = %d%n", i, n, i * n);
        }
    }
}
