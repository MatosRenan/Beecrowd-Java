import java.util.Scanner;

public class Beecrowd1159 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), sum = 0;

        while (x != 0) {

            if (x % 2 != 0) {
                x += 1;
            }

            for (int i = 0; i < 5; i++) {

                sum += x;
                x += 2;
            }
            System.out.println(sum);
            sum = 0;
            x = sc.nextInt();
        }
    }
}
