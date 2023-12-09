import java.util.Scanner;

public class Beecrowd1005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, media;

        a = input.nextDouble();
        b = input.nextDouble();

        media = (a * 3.5 + b * 7.5) / (3.5 + 7.5);

        System.out.printf("MEDIA = %.5f%n", media);
    }
}
