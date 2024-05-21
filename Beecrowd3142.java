import java.util.Locale;
import java.util.Scanner;

public class Beecrowd3142 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};


        while (sc.hasNext()) {

            String letters = sc.next().toUpperCase(Locale.ROOT);
            char[] code = new char[3];
            int pos = 0;

            if (letters.length() == 1) {
                for (int i = 0; i < alphabet.length; i++) {

                    if (letters.charAt(0) == alphabet[i]) {
                        pos = i;
                        break;
                    }
                }
            } else {


                if (letters.length() == 2) {
                    pos = 26;
                    outerloop:
                    for (char c : alphabet) {
                        code[0] = c;
                        for (char value : alphabet) {
                            code[1] = value;
                            pos++;
                            boolean equal = code[0] == letters.charAt(0) && code[1] == letters.charAt(1);
                            if (equal) {
                                break outerloop;
                            }
                        }
                    }
                } else if (letters.length() == 3) {
                    pos = 676;
                    anotherLoop:
                    for (char c : alphabet) {
                        code[0] = c;
                        for (char value : alphabet) {
                            code[1] = value;
                            for (char item : alphabet) {
                                pos++;
                                code[2] = item;
                                boolean equal = code[0] == letters.charAt(0) && code[1] == letters.charAt(1) && code[2] == letters.charAt(2);
                                if (equal || pos > 16358) {
                                    break anotherLoop;
                                }
                            }
                        }
                    }
                }
            }
            if (pos <= 16358) {
                System.out.println(pos);
            } else {
                System.out.println("Essa coluna nao existe Tobias!");
            }
        }
    }
}