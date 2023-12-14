import java.util.Scanner;

public class Beecrowd1017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int time = input.nextInt();
        int averageSpeed = input.nextInt();

        double distance = averageSpeed * time;
        double consume = distance * averageSpeed;

        System.out.printf("%.4f%n", consume);
    }
}
