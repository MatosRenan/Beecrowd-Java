import java.util.Scanner;

public class Beecrowd1858 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int torturer;
        int pos = 0;
        int smaller = 0;

        for (int i = 1; i <= n; i++) {

            torturer = sc.nextInt();

            if (i == 1) {
                pos = 1;
                smaller = torturer;
            }   else {
                if (torturer < smaller) {
                    smaller = torturer;
                    pos = i;
                }
            }

        }
        System.out.println(pos);
    }
}
