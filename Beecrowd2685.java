import java.util.Scanner;

public class Beecrowd2685 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int angle = sc.nextInt();

            if (angle == 360) {
                angle = 0;
            }

            if (angle < 90) {
                System.out.println("Bom Dia!!");
            } else if (angle < 180) {
                System.out.println("Boa Tarde!!");
            } else if (angle < 270) {
                System.out.println("Boa Noite!!");
            }   else {
                System.out.println("De Madrugada!!");
            }
        }
    }
}
