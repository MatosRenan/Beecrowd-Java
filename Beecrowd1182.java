import java.util.Scanner;

public class Beecrowd1182 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] matrix = new double[12][12];

        int column  = sc.nextInt();
        String operation = sc.next().toUpperCase();
        double sumAverage = 0, x;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                x = sc.nextDouble();
                matrix[i][j] = x;
            }
        }

        for (double[] doubles : matrix) {
            sumAverage += doubles[column];
        }

        if (operation.equals("S")) {
            System.out.println(sumAverage);
        }   else if (operation.equals("M")) {
            System.out.printf("%.1f%n", sumAverage/matrix.length);
        }
    }
}
