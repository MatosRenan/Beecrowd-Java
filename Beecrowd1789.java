import java.util.Scanner;

public class Beecrowd1789 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nSlugs, speed;
        while (sc.hasNext()) {
            int faster = 0;

            nSlugs = sc.nextInt();
            for (int i = 0; i < nSlugs; i++) {
                speed = sc.nextInt();

                if (speed > faster) {
                    faster = speed;
                }
            }
            if (faster < 10) {
                System.out.println(1);
            } else if (faster < 20) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }
    }
}
