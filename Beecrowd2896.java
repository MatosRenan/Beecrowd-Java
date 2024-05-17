import java.util.Scanner;

public class Beecrowd2896 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            int drinks = sc.nextInt();
            int boottles = sc.nextInt();

            int nextDay = (drinks%boottles) + (drinks/boottles);
            System.out.println(nextDay);
        }
    }
}
