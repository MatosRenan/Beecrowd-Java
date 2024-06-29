import java.util.Scanner;

public class Beecrowd3037 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int joao = 0;
            int maria = 0;

            for (int j = 0; j < 3; j++) {
                joao += sc.nextInt() * sc.nextInt();
            }

            for (int k = 0; k < 3; k++) {
                maria += sc.nextInt() * sc.nextInt();
            }

            if (joao > maria) {
                System.out.println("JOAO");
            }
            if (maria > joao) {
                System.out.println("MARIA");
            }
        }
    }
}
