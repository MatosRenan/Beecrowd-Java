import java.util.Scanner;

public class Beecrowd1047 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hour_start = input.nextInt();
        int minute_start = input.nextInt();
        int hour_end = input.nextInt();
        int minute_end = input.nextInt();

        int hour = hour_end - hour_start;
        int minute = minute_end - minute_start;

        if (hour <= 0 && minute < 0) {
            hour = 24 + hour - 1;
            minute = 60 + minute;
        }
        if (hour < 0 && minute > 0) {
            hour = 24 + hour;
        }
        if (hour > 0 && minute < 0) {
            hour = hour - 1;
            minute = 60 + minute;
        }

        if (hour_start == hour_end && minute_start == minute_end) {
            hour = 24;
            minute = 0;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", hour, minute);
    }
}
