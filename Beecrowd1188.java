import java.util.ArrayList;
import java.util.Scanner;

public class Beecrowd1188 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Double>> matrix = new ArrayList<>();
        String x = sc.next();
        double sum = 0;

        for (int i = 0; i < 12; i++) {
            ArrayList<Double> line = new ArrayList<>();

            for (int j = 0; j < 12; j++) {
                line.add(sc.nextDouble());
            }
            matrix.add(line);
        }

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (i + j >= 12 && i > j) {
                    sum += matrix.get(i).get(j);
                }
            }
        }

        if (x.equals("S")) {
            System.out.printf("%.1f", sum);
        } else if (x.equals("M")) {
            System.out.printf("%.1f", sum/30);
        }
    }
}
