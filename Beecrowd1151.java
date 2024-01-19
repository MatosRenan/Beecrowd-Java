import java.util.Scanner;

public class Beecrowd1151 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int f1 = 0;
        int f2 = 1;
        int n = sc.nextInt();

        if (n >= 1) {
            if (n == 1) {
                System.out.println(0);
            } else if (n == 2) {
                System.out.println(0 + " " + 1);
            } else {

                System.out.print(0 + " " + 1);
                for (int i = 2; i < n; i++) {

                    int f3 = f1 + f2;
                    f1 = f2;
                    f2 = f3;
                    System.out.printf(" %d", f3);
                }
                System.out.println();
            }
        }
    }
}
