import java.util.Scanner;

public class Beecrowd2551 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int n = sc.nextInt();
            double record = 0;
            int day = 1;
            for (int i = 1; i < n + 1; i++) {

                int time = sc.nextInt();
                int distance = sc.nextInt();
                double speed = (double) distance / time;

                if (i == 1 || speed > record) {
                    record = speed;
                    System.out.println(i);
                }
            }

        }
    }

}
