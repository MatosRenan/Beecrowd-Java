import java.util.Scanner;

public class Beecrowd2708 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String status = sc.next();
        int tourist;
        int jeeps = 0;
        int totalTourist = 0;

        while (!(status.equals("ABEND"))) {

            tourist = sc.nextInt();

            if (status.equals("SALIDA")) {
                totalTourist += tourist;
                jeeps += 1;
            }
            if (status.equals("VUELTA")) {
                totalTourist -= tourist;
                jeeps -= 1;
            }
            status = sc.next();
        }
        System.out.println(totalTourist);
        System.out.println(jeeps);
    }
}
