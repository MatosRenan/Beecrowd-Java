import java.util.Scanner;

public class Beecrowd1132 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int greater, lesser, sum = 0;

        if (x > y) {
            greater = x;
            lesser = y;
        }   else {
            greater = y;
            lesser = x;
        }

        for (int i = lesser; i < greater + 1; i++) {

            if (i % 13 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
