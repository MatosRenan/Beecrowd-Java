import java.util.Scanner;

public class Beecrowd2344 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        char newScore = ' ';

        if (score < 1) {
            newScore = 'E';
        } else if (score < 36) {
            newScore = 'D';
        } else if (score < 61) {
            newScore = 'C';
        } else if (score < 86) {
            newScore = 'B';
        }   else {
            newScore = 'A';
        }
        System.out.println(newScore);
    }
}
