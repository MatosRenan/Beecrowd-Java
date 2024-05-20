import java.util.Scanner;

public class Beecrowd3047 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int monica = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = monica - a - b;

        int[] sons = {a, b, c};
        int maior = 0;
        for (int son : sons) {
            if (son > maior) {
                maior = son;
            }
        }
        System.out.println(maior);
    }
}
