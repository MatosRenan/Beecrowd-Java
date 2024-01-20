import java.util.Scanner;

public class Beecrowd1154 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        double average = 0;
        int cont = 0;

        while (age > 0) {

            average += age;
            cont++;

            age = sc.nextInt();
        }
        average /= cont;
        System.out.printf("%.2f%n", average);
    }
}
