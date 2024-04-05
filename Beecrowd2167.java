import java.util.Scanner;

public class Beecrowd2167 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nTests = sc.nextInt();
        int speed, lastSpeed, pos = 0;

        speed = sc.nextInt();
        lastSpeed = speed;

        for (int i = 0; i < nTests - 1; i++) {

            speed = sc.nextInt();

            if (speed < lastSpeed) {
                pos = i;
                pos+= 2;
                break;
            }   else {
                lastSpeed = speed;
            }
        }

        System.out.println(pos);
    }
}
