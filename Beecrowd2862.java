import java.util.Scanner;

public class Beecrowd2862 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int ki = sc.nextInt();
            if (ki > 8000) {
                System.out.println("Mias de 8000!");
            }   else {
                System.out.println("Inseto!");
            }
        }
    }
}
