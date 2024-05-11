import java.util.Scanner;

public class Beecrowd2581 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String question;

        for (int i = 0; i < n; i++) {

            question = sc.nextLine();

            if (question.contains("?")) {
                System.out.println("I am Toorg!");
            }
        }
    }
}
