import java.util.Scanner;

public class Beecrowd1099 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int greater, lesser;

        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x > y) {
                greater = x;
                lesser = y;
            }   else {
                greater = y;
                lesser = x;
            }

            int sum = 0;

            for (int j = lesser + 1; j < greater; j++) {

                if (j % 2 != 0) {
                    sum += j;
                }
            }

            System.out.println(sum);
        }
    }
}
