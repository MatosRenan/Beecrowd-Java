import java.util.Scanner;

public class Beecrowd1065 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0, x;

        for (int i = 0; i < 5; i++) {
            x = input.nextInt();

            if (x % 2 == 0) {
                count++;
            }
        }
        System.out.println(count + " valores pares");
    }
}
