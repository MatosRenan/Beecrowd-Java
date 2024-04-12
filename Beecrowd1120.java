import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;


public class Beecrowd1120 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        while (!Objects.equals(a, "0") && !Objects.equals(b, "0")) {

            System.out.println(verifyNumber(a, b));

            a = sc.next();
            b = sc.next();
        }

    }

    private static String verifyNumber(String a, String b) {

        String x = "";
        boolean onlyZero = true;
        for (int i = 0; i < b.length(); i++) {

            if (b.charAt(i) != a.charAt(0)) {

                x += b.charAt(i);

            }
        }

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != '0') {
                onlyZero = false;
                break;
            }
        }

        if (onlyZero) {
            return "0";
        }   else {
            x = x.replaceAll("^0+", "");
            return x;
        }
    }

}