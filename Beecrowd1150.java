import java.util.Scanner;

public class Beecrowd1150 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int z = sc.nextInt();
        int cont = 1, sum = x;

        while (z <= x) {
            z = sc.nextInt();
        }

        while (x < z) {

            sum += 1;
            x += sum;
            cont++;
        }
        System.out.println(cont);
    }
}
