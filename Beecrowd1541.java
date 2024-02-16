import java.util.Scanner;

public class Beecrowd1541 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c, landSize;

        while (true) {

            a = sc.nextInt();
            if (a == 0) {
                break;
            }

            b = sc.nextInt();
            c = sc.nextInt();

            landSize = (int) Math.sqrt((double) (100 * b * a) / c);
            System.out.println(landSize);

        }

    }
}
