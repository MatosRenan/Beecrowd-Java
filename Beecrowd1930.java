import java.util.Scanner;

public class Beecrowd1930 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, sum = 0;

        for (int i = 0; i < 4; i++) {
            n = sc.nextInt();
            sum += n;
        }

        System.out.println(sum - 3);
    }
}
