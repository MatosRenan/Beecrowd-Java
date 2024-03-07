import java.util.Scanner;

public class Beecrowd2006 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tea = sc.nextInt(), correctTea = 0;

        for (int i = 0; i < 5; i++) {
            int attempt = sc.nextInt();

            if (attempt == tea) {
                correctTea++;
            }
        }
        System.out.println(correctTea);

    }
}
