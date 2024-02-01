import java.util.Scanner;

public class Beecrowd1589 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        int r1, r2, r3 = 0;
        for (int i = 0; i < test; i++) {

            r1 = sc.nextInt();
            r2 = sc.nextInt();
            r3 = r1 + r2;

            System.out.println(r3);
        }
    }
}
