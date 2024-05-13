import java.util.Scanner;

public class Beecrowd2717 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int timeToFabricate = 0;

        for (int i = 0; i < 2; i++) {
            int tProduct = sc.nextInt();
            timeToFabricate += tProduct;

        }

        if (n >= timeToFabricate) {
            System.out.println("Farei hoje!");
        }   else {
            System.out.println("Deixa pra amanha!");
        }
    }
}
