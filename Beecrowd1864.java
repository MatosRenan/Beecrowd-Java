import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1864 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String phrase = "Life is not a problem to be solved".toUpperCase(Locale.ROOT);
        char[] arrayPhrase = phrase.toCharArray();

        int n = sc.nextInt() - 1;

        for (int i = 0; i <= n; i++) {
            System.out.printf(String.valueOf(arrayPhrase[i]));
        }
        System.out.println();
    }
}
