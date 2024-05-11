import java.util.Scanner;

public class Beecrowd2702 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] meals = new int[3];
        int[] people = new int[3];
        int cont = 0, notReceive = 0;

        for (int i = 0; i < 6; i++) {
            int n = sc.nextInt();

            if (i < 3) {
                meals[i] = n;
            }   else {
                people[cont] = n;
                cont++;
            }
        }
        for (int i = 0; i < 3; i++) {
            int n = meals[i] - people[i];

            if (n < 0) {
                notReceive += Math.abs(n);
            }
        }
        System.out.println(notReceive);
    }
}
