import java.util.Scanner;

public class Beecrowd1045 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double aux;

        if (b > a && b > c) {
            aux = b;
            b = a;
            a = aux;
        } else if (c > a && c > b) {
            aux = c;
            c = a;
            a = aux;
        }
        boolean notriangle = a >= b + c;
        double aelevatea = Math.pow(a, 2);
        double bplusc = Math.pow(b, 2) + Math.pow(c, 2);

        boolean ret = aelevatea == bplusc;
        boolean obt = aelevatea > bplusc;
        boolean act = aelevatea < bplusc;
        boolean equil = a == b && b == c;
        boolean isoc = (a == b && a != c) || (a == c && a != b) || (b == c && b != a);

        if (notriangle) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (ret) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (obt) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (act) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (equil) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if (isoc) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}