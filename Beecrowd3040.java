import java.util.Scanner;

public class Beecrowd3040 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int height, diameter, branches;

        for (int i = 0; i < n; i++) {

            height = sc.nextInt();
            diameter = sc.nextInt();
            branches = sc.nextInt();

            if ((height >= 200 && height <= 300) && diameter >= 50 && branches >= 150) {
                System.out.println("Sim");
            }   else {
                System.out.println("Nao");
            }
        }
    }
}
