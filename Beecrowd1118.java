import java.util.Scanner;

public class Beecrowd1118 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int teste = 1;

        while (teste != 2) {

            double score1 = sc.nextDouble();

            while (score1 < 0 || score1 > 10) {

                System.out.println("nota invalida");
                score1 = sc.nextDouble();
            }

            double score2 = sc.nextDouble();

            while (score2 < 0 || score2 > 10) {

                System.out.println("nota invalida");
                score2 = sc.nextDouble();
            }

            double media = (score1 + score2)/2;
            System.out.printf("media = %.2f%n", media);
            System.out.println("novo calculo (1-sim 2-nao)");
            teste = sc.nextInt();

            while (teste != 1 && teste != 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                teste = sc.nextInt();
            }
        }
    }
}
