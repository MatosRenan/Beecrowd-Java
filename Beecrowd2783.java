import java.util.Scanner;

public class Beecrowd2783 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nCards = sc.nextInt();
        int cardsMissing = sc.nextInt();
        int purchased = sc.nextInt();

        int[] listOfMissing = new int[cardsMissing];

        for (int i = 0; i < cardsMissing; i++) {
            listOfMissing[i] = sc.nextInt();
        }

        int contMissing = cardsMissing;

        outerLoop:
        for (int i = 0; i < purchased; i++) {
            int card = sc.nextInt();

            for (int j = 0; j < listOfMissing.length; j++) {

                if (card == listOfMissing[j]) {
                    contMissing--;

                    listOfMissing[j] = -1;
                    break;
                }
                if (contMissing == 0) {
                    break outerLoop;
                }
            }
        }
        System.out.println(contMissing);
    }
}
