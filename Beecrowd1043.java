import java.util.Scanner;

public class Beecrowd1043 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        boolean plus = a + b > c && b + c > a && a + c > b;
        boolean sub = a - b < c && b - a < c && a - c < b && c - a < b && b - c < a && c - b < a;

        double per;
        double area;

        if (plus && sub) {
            per = a + b + c;
            System.out.printf("Perimetro = %.1f", per);
        }   else {
            area = (a + b) * c/2;
            System.out.printf("Area = %.1f", area);
        }
    }
}
