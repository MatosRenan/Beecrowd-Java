import java.util.Scanner;

public class Beecrowd2791 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] cups = new int[4];
        int pos;

        for (int i = 0; i < 4; i++) {
            cups[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            if (cups[i] == 1) {
                pos = i + 1;
                System.out.println(pos);
                break;
            }
        }
    }
}
