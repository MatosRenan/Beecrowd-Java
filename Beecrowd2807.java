import java.util.Scanner;

public class Beecrowd2807 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int f1 = 1, f2 = 1, f3 = 2;
        int n = sc.nextInt();
        int[] sequence = new int[n];

        for (int i = 0; i < n; i++) {
            sequence[i] = f1;

            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }

        for (int i = n - 1; i > -1; i--) {
            if (i == 0) {
                System.out.println(sequence[i]);
            }   else {
                System.out.printf("%d ", sequence[i]);
            }
        }
    }
}
