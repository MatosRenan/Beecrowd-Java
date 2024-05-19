import java.util.Scanner;

public class Beecrowd2987 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] uppercaseAlphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char letter = sc.next().toUpperCase().charAt(0);

        for (int i = 0; i < uppercaseAlphabet.length; i++) {
            if (letter == uppercaseAlphabet[i]) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
