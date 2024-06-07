import java.util.Scanner;

public class Beecrowd2540 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int votes = 0;
            double rate = 2.0/3*n;
            for (int i = 0; i < n; i++) {
                votes += sc.nextInt();
            }

            if (votes >= rate) {
                System.out.println("impeachment");
            }   else {
                System.out.println("acusacao arquivada");
            }
        }

    }
}
