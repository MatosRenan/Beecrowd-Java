import java.util.Scanner;

public class Beecrowd2547 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int n = sc.nextInt();
            int min = sc.nextInt();
            int max = sc.nextInt();
            int cont = 0, height;
            for (int i = 0; i < n; i++) {

                height = sc.nextInt();
                if (height >= min && height <= max) {
                    cont++;
                }
            }
            System.out.println(cont);
        }
    }
}
