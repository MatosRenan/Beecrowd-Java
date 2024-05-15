import java.util.Scanner;

public class Beecrowd2779 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cards = new int[n];
        int cont = 0;
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int nCard = sc.nextInt() - 1;
            cards[nCard] += 1;
        }

        for (int card : cards) {
            if (card == 0) {
                cont++;
            }
        }

        System.out.println(cont);
    }
}
