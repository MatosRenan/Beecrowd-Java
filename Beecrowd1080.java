import java.util.Scanner;

public class Beecrowd1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int higher = 0;
        int position = 0;

        for (int i = 0; i < 10; i++) {

            int x = sc.nextInt();

            if (x > higher) {
                higher = x;
                position = i;
            }
        }
        System.out.printf("%d%n%d%n", higher, position);
    }
}
