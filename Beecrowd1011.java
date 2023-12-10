import java.util.Scanner;

public class Beecrowd1011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double raio, volume;

        raio = input.nextDouble();
        volume = Math.pow(raio, 3) * raio * 4/3;

        System.out.printf("VOLUME = %.3f%n", volume);
    }
}
