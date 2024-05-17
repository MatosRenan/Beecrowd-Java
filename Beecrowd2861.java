import java.util.Scanner;

public class Beecrowd2861 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String question;

        for (int i = 0; i < n + 1; i++) {
            question = sc.nextLine();
            if (question.contains("?")) {
                System.out.println("gzuz");
            }
        }
    }
}
