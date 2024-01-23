import java.util.ArrayList;
import java.util.Scanner;

public class Beecrowd1174 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Double> lista = new ArrayList<>();
        double x;

        for (int i = 0; i < 100; i++) {

            x = sc.nextInt();
            lista.add(x);

            if (x <= 10) {
                System.out.printf("A[%d] = %.1f", i, lista.get(i));
            }
        }
    }
}
