import java.util.Scanner;

public class Beecrowd2176 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String binary = sc.next();
        int contOne = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                contOne++;
            }
        }
        boolean evenO = contOne % 2 == 0;

        if (evenO) {
            binary += '0';
        }   else {
            binary += '1';
        }

        System.out.println(binary);
    }
}
