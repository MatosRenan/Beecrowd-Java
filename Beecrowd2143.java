import java.util.Scanner;

public class Beecrowd2143 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nCases = sc.nextInt();

        while (nCases != 0) {
            for (int i = 0; i < nCases; i++) {

                int nPeople = sc.nextInt();
                if (nPeople % 2 != 0) {
                    System.out.println(nPeople * 2 - 1);
                }   else {
                    System.out.println(nPeople * 2 - 2);
                }

            }
            nCases = sc.nextInt();
        }
    }
}
