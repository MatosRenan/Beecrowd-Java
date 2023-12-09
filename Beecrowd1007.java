import java.util.Scanner;

public class Beecrowd1007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c, d, dif;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        dif = (a * b) - (c * d);

        System.out.printf("DIFERENCA = %d%n", dif);

    }
}
