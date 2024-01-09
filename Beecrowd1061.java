import java.util.Scanner;

public class Beecrowd1061 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        input.next();
        int dayStart = input.nextInt() * 86400;
        int hourStart = input.nextInt() * 3600;
        input.next();
        int minuteStart = input.nextInt() * 60;
        input.next();
        int secondStart = input.nextInt();

        input.next();
        int dayEnd = input.nextInt() * 86400;
        int hourEnd = input.nextInt() * 3600;
        input.next();
        int minuteEnd = input.nextInt() * 60;
        input.next();
        int secondEnd = input.nextInt();

        int totalStartSeconds = dayStart + hourStart + minuteStart + secondStart;
        int totalEndSeconds = dayEnd + hourEnd + minuteEnd + secondEnd;

        int duration = totalEndSeconds - totalStartSeconds;

        int day = duration/86400;
        duration = duration % 86400;


        int hour = duration/3600;
        duration = duration % 3600;

        int minute = duration/60;
        duration = duration % 60;

        int seconds = duration;

        System.out.println(day + " dia(s)");
        System.out.println(hour + " hora(s)");
        System.out.println(minute + " minuto(s)");
        System.out.println(seconds + " segundo(s)");

        input.close();
    }
}
