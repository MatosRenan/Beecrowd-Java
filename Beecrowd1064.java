import java.util.Scanner;

public class Beecrowd1064 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        double media = 0, x;

        for (int i = 0; i < 6; i++) {

            x = input.nextDouble();

            if (x > 0) {
                count++;
                media /= count;
            }
        }
        System.out.println(count + " valores positivos");
        System.out.printf("%.1f%n", media);
    }
}
