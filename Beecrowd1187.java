import java.util.ArrayList;
import java.util.Scanner;

public class Beecrowd1187 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String operation = sc.next();
        double sum = 0;
        ArrayList<ArrayList<Double>> matrix = new ArrayList<>();

        for (int i = 0; i < 12; i++) {
            ArrayList<Double> row = new ArrayList<>();

            for (int j = 0; j < 12; j++) {
                row.add(sc.nextDouble());
                if (i + j < 11 && i < j ) {
                    sum += row.get(j);
                }
            }
            matrix.add(row);
        }

        if (operation.equals("S")) {
            System.out.printf("%.1f%n", sum);
        } else if (operation.equals("M")) {
            System.out.printf("%.1f%n", sum/30);
        }
    }
}
