import java.util.Scanner;

public class Beecrowd1962 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), year;

        for (int i = 0; i < n; i++) {
            year = sc.nextInt();

            if (year > 2014) {
                System.out.println(year - 2014 + " " + "A.C.");
            }   else {
                System.out.println(2015 - year + " " + "D.C.");
            }
        }
    }
}
