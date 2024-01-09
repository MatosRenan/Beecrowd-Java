import java.util.Scanner;

public class Beecrowd1073 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 0; i <= N; i++) {

            if (i % 2 == 0) {
                System.out.printf("%d^2 = %d", i, i*i);
            }
        }
    }
}
