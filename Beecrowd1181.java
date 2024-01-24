import java.util.Scanner;

public class Beecrowd1181 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] matrix = new double[12][12];

        int line = sc.nextInt();

        String operation = sc.next().toUpperCase();

        double sumAverage = 0, x;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                x = sc.nextDouble();
                matrix[i][j] = x;
            }
        }

        for (int i = 0; i < matrix.length; i++) {

            sumAverage += matrix[line][i];
        }

        if (operation.equals("S")) {
            System.out.println(sumAverage);
        }   else if (operation.equals("M")) {
            System.out.printf("%.1f%n", sumAverage/matrix.length);
        }
    }
}
