import java.util.Scanner;

public class Beecrowd2221 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int bonus = sc.nextInt();
            double valueD = valueCalculator(sc, bonus);
            double valueG = valueCalculator(sc, bonus);

            if (valueG > valueD) {
                System.out.println("Guarte");
            } else if (valueG < valueD) {
                System.out.println("Dabriel");
            }   else {
                System.out.println("Empate");
            }
        }

    }

    public static double valueCalculator (Scanner sc, int bonus) {

        int value = 0;
        for (int i = 0; i < 2; i++) {
            value += sc.nextInt();
        }
        value /= 2;
        int level = sc.nextInt();

        if (level % 2 == 0) {
            value += bonus;
        }

        return value;
    }
}
