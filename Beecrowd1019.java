import java.util.Scanner;

public class Beecrowd1019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalSeconds = input.nextInt();

        int hour = totalSeconds/3600;
        totalSeconds -= hour * 3600;

        int minutes = totalSeconds/60;
        totalSeconds -= minutes * 60;

        int seconds  = totalSeconds;

        System.out.printf("%d:%d:%d%n", hour, minutes, seconds);
    }
}
