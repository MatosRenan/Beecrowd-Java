import java.util.Scanner;

public class Beecrowd1070 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        for (int i = 0; i < 6; i++) {

            if (x % 2 != 0) {
                System.out.println(x);
            }
            x++;
        }
    }
}
