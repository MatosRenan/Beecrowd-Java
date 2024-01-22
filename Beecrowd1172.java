import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Beecrowd1172 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            int x = sc.nextInt();
            if (x > 0) {
                numbers.add(x);
            }   else {
                numbers.add(1);
            }

            System.out.printf("X[%d] = %d%n", i, numbers.get(i));
        }
    }
}
