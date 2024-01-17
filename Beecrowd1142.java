import java.util.Scanner;

public class Beecrowd1142 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cont = 1;
        int line = sc.nextInt();
        int aux = 0;

        while (aux < line) {

            System.out.printf("%d ", cont);
            cont++;

            if (cont % 4 == 0) {
                System.out.println("PUM");
                aux++;
            }
        }
    }
}
