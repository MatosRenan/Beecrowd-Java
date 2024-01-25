import java.util.Scanner;

public class Beecrowd1183 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] matrix = new double[12][12];
        double sum = 0;
        String operation = sc.next().toUpperCase();

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matrix[i][j] = sc.nextDouble();

                if (j > i) {
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
