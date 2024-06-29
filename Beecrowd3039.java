import java.util.Scanner;

public class Beecrowd3039 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int carrinhos = 0;
        int bonecas = 0;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String name = sc.next();
            char gender = sc.next().charAt(0);

            if (gender == 'M') {
                carrinhos++;
            }
            if (gender == 'F') {
                bonecas++;
            }
        }
        System.out.println(carrinhos + " carrinhos");
        System.out.println(bonecas + " bonecas");
    }
}
