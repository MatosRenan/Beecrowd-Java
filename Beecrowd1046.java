import java.util.Scanner;

public class Beecrowd1046 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int start = input.nextInt();
        int end = input.nextInt();
        int time;

        if (start < end) {
            time = end - start;
        } else if (start > end) {
            time = 24 - (start - end);
        }   else {
            time = 24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)%n", time);
    }
}
