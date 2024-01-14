import java.util.Scanner;

public class Beecrowd1101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        while (n > 0 && m > 0) {

            int greater, lesser, sum = 0;

            if (n > m) {
                greater = n;
                lesser = m;
            }   else {
                greater = m;
                lesser = n;
            }

            for (int i = lesser; i <= greater; i++) {

                System.out.printf("%d ", i);
                sum += i;
            }
            System.out.printf("Sum=%d", sum);

            n = sc.nextInt();
            m = sc.nextInt();
        }

    }
}
