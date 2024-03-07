import java.util.Scanner;

public class Beecrowd2003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String hour = sc.next();
            int eightHourInMinutes = 480;
            int hourInMinutes = Integer.parseInt(hour.substring(0, 1)) * 60 + Integer.parseInt(hour.substring(2, 4));
            int delay = eightHourInMinutes - hourInMinutes - 60;

            if (delay < 0) {
                System.out.println("Atraso maximo: " + Math.abs(delay));
            }   else {
                System.out.println("Atraso maximo: 0");
            }

        }

    }
}
