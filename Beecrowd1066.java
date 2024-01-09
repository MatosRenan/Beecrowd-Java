import java.util.Scanner;

public class Beecrowd1066 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int odd = 0, even = 0, pos = 0, neg = 0, x;

        for (int i = 0; i < 5; i++) {

            x = input.nextInt();

            if (x % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            if (x > 0 ) {
                pos++;
            } else {
                neg++;
            }
        }
        System.out.println(even + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");
    }
}
