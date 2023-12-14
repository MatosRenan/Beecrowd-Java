import java.util.Scanner;

public class Beecrowd1020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalDays = input.nextInt();

        int year = totalDays/365;
        totalDays -= year * 365;

        int month = totalDays/30;
        totalDays -= month * 30;

        int day = totalDays;

        System.out.printf("%d ano(s)", year);
        System.out.printf("%d mes(es)", month);
        System.out.printf("%d dia(s)", year);
    }
}
