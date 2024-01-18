import java.util.Scanner;

public class Beecrowd1146 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String numbers = "";

        while (x != 0) {

            for (int i = 1; i <= x ; i++) {

                if (i < x) {
                    numbers += i + " ";
                }  else {
                    numbers += i + "";
                }
            }
            System.out.println(numbers);
            numbers = "";
            x = sc.nextInt();
        }
    }
}
