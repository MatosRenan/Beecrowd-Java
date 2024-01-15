import java.util.Scanner;

public class Beecrowd1117 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double score1 = sc.nextDouble();

        while (score1 > 10 || score1 < 0) {
            System.out.println("nota invalida");
            score1 = sc.nextDouble();
        }

        double score2 = sc.nextDouble();

        while (score2 > 10 || score2 < 0) {
            System.out.println("nota invalida");
            score2 = sc.nextDouble();
        }

        double media = (score1 + score2)/2;
        System.out.printf("%.2f%n", media);
    }
}
