import java.util.ArrayList;
import java.util.Scanner;

public class Beecrowd1178 {
    public static void main(String[] args) {

        ArrayList<Double> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        lista.add(x);
        System.out.printf("N[0] = %.4f%n", x);
        for (int i = 1; i < 100; i++) {

            x /= 2;
            lista.add(x);
            System.out.printf("N[%d] = %.4f%n", i, lista.get(i));
        }
    }
}
