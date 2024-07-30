import java.util.Scanner;

public class Beecrowd3342 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int white = 0;
        int black = 0;

        for (int i = 0; i < n * n; i++) {

            if (i % 2 == 0) {
                white++;
            }  else {
                black++;
            }
        }

        System.out.println(white + " casas brancas" + " e " + black + " casas pretas");

    }
}
