import java.util.Scanner;

public class Beecrowd1285 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int total = m - n + 1;

            for (int i = n; i <= m; i++) {

                String aux = String.valueOf(i);

                if (aux.length() == 2) {
                    if (aux.charAt(0) == aux.charAt(1)) {
                        total--;
                    }
                }   else {
                    outerloop:
                    for (int j = 0; j < aux.length() - 1; j++) {
                        char n1 = aux.charAt(j);

                        for (int k = j + 1; k < aux.length(); k++) {
                            char n2 = aux.charAt(k);

                            if (n1 == n2) {

                                total--;
                                break outerloop;
                            }
                        }
                    }
                }
            }
            System.out.println(total);
        }

    }
}
