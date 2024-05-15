import java.util.Scanner;

public class Beecrowd2234 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double hotDogs = sc.nextDouble();
        int participants = sc.nextInt();

        System.out.printf("%.2f", hotDogs/participants);
    }
}
