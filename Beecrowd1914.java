import java.util.Scanner;

public class Beecrowd1914 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            String player1 = sc.next();
            String choose1 = sc.next();
            String player2 = sc.next();
            String choose2 = sc.next();
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();

            String winner = (number1 + number2) % 2 == 0 ? choose1 : choose2;
            System.out.println(winner.equalsIgnoreCase("PAR") ? player1 : player2);
            System.out.println(winner);
        }
    }
}
