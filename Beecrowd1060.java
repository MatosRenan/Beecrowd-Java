import java.util.Scanner;

public class Beecrowd1060 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int cont = 0;

        for (int i = 0; i < 6; i++) {
            double x = input.nextDouble();

            if (x > 0) {
                cont++;
            }
        }
        System.out.println(cont + " valores positivos");
    }
}
