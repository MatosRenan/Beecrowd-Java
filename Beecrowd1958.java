import java.util.Scanner;

public class Beecrowd1958 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double number = sc.nextDouble();

        if (String.valueOf(number).startsWith("-")) {
            System.out.printf("%.4E%n", number);
        } else {
            System.out.printf("+%.4E%n", number);
        }

    }
}
