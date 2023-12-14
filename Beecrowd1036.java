import java.util.Scanner;

public class Beecrowd1036 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double x1, x2;
        double delta = Math.pow(b, 2) - 4 * a * c;

        boolean valiable = delta >= 0 && a != 0;

        if (valiable) {
            x1 = (-b + Math.sqrt(delta))/ (2 * a);
            x2 = (-b - Math.sqrt(delta))/ (2 * a);
            System.out.printf("%.5f", x1);
            System.out.printf("%.5f", x2);
        } else {
            System.out.println("Impossivel calcular");
        }
    }
}
