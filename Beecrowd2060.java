import java.util.Scanner;

public class Beecrowd2060 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mTwo = 0, mThree = 0, mFour = 0, mFive = 0;

        for (int i = 0; i < n; i++) {

            int number = sc.nextInt();

            if (number % 2 == 0) {
                mTwo++;
            }

            if (number % 3 == 0) {
                mThree++;
            }
            if (number % 4 == 0) {
                mFour++;
            }
            if (number % 5 == 0) {
                mFive++;
            }
        }

        System.out.println(mTwo + " Multiplo(s) de 2");
        System.out.println(mThree + " Multiplo(s) de 3");
        System.out.println(mFour + " Multiplo(s) de 4");
        System.out.println(mFive + " Multiplo(s) de 5");
    }
}
