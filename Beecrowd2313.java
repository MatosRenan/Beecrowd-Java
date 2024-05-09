import java.util.Scanner;

public class Beecrowd2313 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        checkTriangle(a, b, c);
        if (!(a + b < c || a + c < b || b + c < a)) {
            checkRetangle(a, b, c);
        }
    }
    public static void checkTriangle (int a, int b, int c) {

        if (a + b < c || a + c < b || b + c < a) {
            System.out.println("Invalido");
        }   else {
            System.out.print("Valido-");
            if (a == b && a == c) {
                System.out.println("Equilatero");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isoceles");
            }   else {
                System.out.println("Escaleno");
            }
        }
    }
    public static void checkRetangle (int a, int b, int c) {

        // Sort sides in ascending order
        int minSide = Math.min(Math.min(a, b), c);
        int maxSide = Math.max(Math.max(a, b), c);
        int middleSide = a + b + c - minSide - maxSide;


        // Check if it satisfies the Pythagorean theorem
        if (minSide * minSide + middleSide * middleSide == maxSide * maxSide) {
            System.out.println("Retangulo: S");
        }   else {
            System.out.println("Retangulo: N");
        }
    }
}
