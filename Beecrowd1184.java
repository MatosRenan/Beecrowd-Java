import java.util.Scanner;

public class Beecrowd1184 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] matrix = new double[12][12];
        String operation = sc.next();
        double sum = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {

                matrix[i][j] = sc.nextDouble();
                if (i > j) {
                    sum += matrix[i][j];
                }
            }
        }
        if (operation.equals("S")) {
            System.out.printf("%.1f%n", sum);
        } else if (operation.equals("M")) {
            System.out.printf("%.1f%n", sum/66);
        }
    }
}
