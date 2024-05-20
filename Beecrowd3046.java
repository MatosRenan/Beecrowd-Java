import java.util.Scanner;

public class Beecrowd3046 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total = 1;
        int nPecas = 1;

        for (int i = 1; i <= n; i++) {
            nPecas = i + 1;
            total += nPecas;
        }

        System.out.println(total);
    }
}
