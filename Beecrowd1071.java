import java.util.Scanner;

public class Beecrowd1071 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int greater, lesser, sum = 0;

        if (x >= y) {
            greater  = x;
            lesser = y;
        }   else {
            greater = y;
            lesser = x;
        }

        for (int i = lesser; i < greater; i++) {

            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
