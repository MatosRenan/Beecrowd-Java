import java.util.Scanner;

public class Beecrowd1002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14159, area, raio;
        raio = input.nextDouble();
        area = raio * raio * pi;

        System.out.printf("A=%.4f%n", area);
    }
}
