import java.util.Scanner;

public class Beecrowd2879 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cont = 0;

        for (int i = 0; i < n; i++) {

            int door = sc.nextInt();
            if (door == 2 || door == 3) {
                cont ++;
            }
        }
        System.out.println(cont);
    }
}
