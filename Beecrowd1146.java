import java.util.Scanner;

public class Beecrowd1146 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        StringBuilder numbers = new StringBuilder();

        while (x != 0) {

            for (int i = 1; i <= x ; i++) {

                if (i < x) {
                    numbers.append(i).append(" ");
                }  else {
                    numbers.append(i);
                }
            }
            System.out.println(numbers);
            numbers = new StringBuilder();
            x = sc.nextInt();
        }
    }
}
