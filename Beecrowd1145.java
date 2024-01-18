import java.util.Scanner;

public class Beecrowd1145 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int cont = 1;

        if (x > 1 && x < 20) {

            if (y > x && y < 100000) {
                for (int i = 1; i <= y ; i++) {


                    if (cont == x) {
                        System.out.println(i);
                        cont = 0;
                    } else {
                        System.out.printf("%d ", i);
                    }
                    cont++;
                }
            }
        }
    }
}
