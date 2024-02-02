import java.util.Scanner;

public class Beecrowd1828 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        String sheldon, raj;

        for (int i = 1; i <= test; i++) {

            sheldon = sc.next();
            raj = sc.next();

            if (sheldon.equals(raj)) {
                System.out.printf("Caso #%d: De novo!%n", i);
            }   else {
                if (sheldon.equals("tesoura") && (raj.equals("papel") || raj.equals("lagarto"))) {
                    System.out.printf("Caso #%d: Bazinga!%n", i);
                } else if (sheldon.equals("papel") && (raj.equals("pedra") || raj.equals("Spock"))) {
                    System.out.printf("Caso #%d: Bazinga!%n", i);
                }   else if (sheldon.equals("pedra") && (raj.equals("lagarto") || raj.equals("tesoura"))) {
                    System.out.printf("Caso #%d: Bazinga!%n", i);
                }   else if (sheldon.equals("lagarto") && (raj.equals("Spock") || raj.equals("papel"))) {
                    System.out.printf("Caso #%d: Bazinga!%n", i);
                }   else if (sheldon.equals("Spock") && (raj.equals("tesoura") || raj.equals("pedra"))) {
                    System.out.printf("Caso #%d: Bazinga!%n", i);
                }   else {
                    System.out.printf("Caso #%d: Raj trapaceou!%n", i);
                }

            }
        }
    }
}
