import java.util.Scanner;

public class Beecrowd2029 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            double volume = sc.nextDouble();
            double diameter = sc.nextDouble();
            double radius = diameter/2;
            double area = 3.14 * Math.pow(radius, 2);
            double height = volume/area;

            System.out.printf("ALTURA = %.2f%n", height);
            System.out.printf("AREA = %.2f%n", area);
        }

    }
}
