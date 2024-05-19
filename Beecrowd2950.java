import java.util.Scanner;

public class Beecrowd2950 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int distance = sc.nextInt();
        double tDiameters = 0.0;

        for (int i = 0; i < 2; i++) {
            tDiameters += sc.nextInt();
        }
        System.out.printf("%.2f\n", distance/tDiameters);
    }
}
