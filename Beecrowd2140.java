import java.util.Scanner;

public class Beecrowd2140 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int paid = sc.nextInt();
        int change = paid - price;
        boolean possible = false;

        int[] bills = {2, 5, 10, 20, 50, 100};

        while (price != 0 && paid != 0) {

            for (int b1 : bills) {
                if (change > b1) {
                    for (int b2 : bills) {
                        if (b1 != b2) {
                            if (change - b1 - b2 == 0) {
                                possible = true;
                                break;
                            }
                        }
                    }
                }
            }
            if (possible) {
                System.out.println("possible");
            }   else {
                System.out.println("impossible");
            }

            price = sc.nextInt();
            paid = sc.nextInt();
            possible = false;
            change = paid - price;
        }

    }
}
