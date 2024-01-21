import java.util.Scanner;

public class Beecrowd1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x, y, sum = 0;

        for (int i = 0; i < n; i++) {

            x = sc.nextInt();
            y = sc.nextInt();

            if (x % 2 == 0) {
                x += 1;
            }

            for (int j = 0; j < y; j++) {

                sum += x;
                x += 2;
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}
