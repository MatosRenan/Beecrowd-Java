import java.util.Scanner;

public class Beecrowd1013 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, c;
        double maiorab, maiorabc, dif;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if (a > b) {
            dif = a - b;
        }   else {
            dif = (a - b) * -1;
        }

        maiorab = (a + b + dif)/2;

        if (maiorab > c) {
            dif = maiorab - c;
        }   else {
            dif = (maiorab - c) * -1;
        }

        maiorabc =  (maiorab + c + dif) /2;

        System.out.printf("%.0f eh o maior%n", maiorabc);
    }
}
