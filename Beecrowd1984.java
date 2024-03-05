import java.util.Scanner;

public class Beecrowd1984 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String number = sc.next();
        StringBuilder inverseNumber = new StringBuilder();

        for (int i = number.length() - 1; i > -1; i--) {
            char letter = number.charAt(i);
            inverseNumber.append(letter);
        }

        System.out.println(inverseNumber);
    }
}
