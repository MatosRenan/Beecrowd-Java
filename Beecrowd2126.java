import java.util.Scanner;

public class Beecrowd2126 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nSubsquence, nCase = 0, pos;

        while (sc.hasNext()) {

            nCase++;
            nSubsquence = 0;
            pos = 0;

            String n1 = sc.next();
            String n2 = sc.next();

            if (n2.contains(n1)) {

                for (int i = 0; i < n2.length(); i++) {

                    if (i + n1.length() <= n2.length()) {
                        if (n2.substring(i, i + n1.length()).equals(n1)) {
                            nSubsquence++;
                            pos = i;
                        }
//                        if (n2.startsWith(n1, i)) {
//                            nSubsquence++;
//                            pos = i;
//                        }
                    }
                }

                pos++;

                System.out.println("Caso #" + nCase + ":");
                System.out.println("Qtd.Subsequencias: " + nSubsquence);
                System.out.println("Pos: " + pos);

            }   else {
                System.out.println("Caso #" + nCase + ":");
                System.out.println("Nao existe subsequencia");
            }

            System.out.println();
        }

    }
}