import java.util.Scanner;

public class Beecrowd3302 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int answer = sc.nextInt();
            System.out.printf("resposta %d: %d\n", i + 1, answer);
        }
    }
}
