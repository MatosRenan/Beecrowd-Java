import java.util.Scanner;

public class Beecrowd1035 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        boolean aceito = false;

        if (b > c) {
            if (d > a) {
                if (c + d > a + b) {
                    if (c > 0 && d > 0) {
                        if ( a % 2 == 0) {
                            aceito = true;
                        }
                    }
                }
            }
        }
        if (aceito) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
