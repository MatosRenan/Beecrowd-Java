import java.util.Locale;
import java.util.Scanner;

public class Beecrowd3142 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};


        while (sc.hasNext()) {

            String letters = sc.next().toUpperCase(Locale.ROOT);
            String code = "";
            int pos = 0;

            if (letters.length() == 1) {
                for (int i = 0; i < alphabet.length; i++) {
                    code = alphabet[i];
                    if (letters.equals(code)) {
                        pos = i;
                        break;
                    }
                }
            }   else if (letters.length() == 2) {
                pos = 26;
                outerloop:
                for (int i = 0; i < letters.length(); i++) {
                    code = alphabet[i];
                    for (int j = 0; j < letters.length(); j++) {
                        code = code.concat(alphabet[j]);
                        System.out.println(code);
                        pos++;
                        if (letters.equals(code)) {
                            break outerloop;
                        }
                    }
                }
            }   else if (letters.length() == 3) {
                outerloop:
                for (int i = 0; i < letters.length(); i++) {
                    for (int j = 0; j < letters.length(); j++) {
                        for (int k = 0; k < letters.length(); k++) {
                            System.out.println(i);
                        }
                    }
                }
            }

        System.out.println(pos);
        }
    }
}
