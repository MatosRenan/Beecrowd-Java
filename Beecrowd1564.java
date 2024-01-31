import java.util.Scanner;

public class Beecrowd1564 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;

        while (sc.hasNext()) {

            x = sc.nextInt();
            if (x > 0) {
                System.out.println("vai ter duas");
            } else if (x == 0) {
                System.out.println("vai ter copa");
            }
        }
    }
}
