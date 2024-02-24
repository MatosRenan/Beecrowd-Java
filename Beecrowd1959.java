import java.util.Scanner;

public class Beecrowd1959 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long nSides = sc.nextInt();
        long lenghtSide = sc.nextInt();

        if (nSides >= 3 && nSides <= 1000000 && lenghtSide <= 4000) {
            System.out.println(nSides * lenghtSide);
        }

    }
}
