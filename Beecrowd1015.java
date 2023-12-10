import java.util.Scanner;

public class Beecrowd1015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int distance = input.nextInt();
        double spentFuel = input.nextDouble();

        double consume = distance/spentFuel;

        System.out.printf("%.3f km/l", consume);
    }
}
