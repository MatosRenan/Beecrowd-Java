import java.util.Scanner;

public class Beecrowd1133 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int greater, lesser;

        if (x > y) {
            greater = x;
            lesser = y;
        } else {
            greater = y;
            lesser = x;
        }

        for (int i = lesser; i < greater; i++) {

            if (i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }
    }
}
