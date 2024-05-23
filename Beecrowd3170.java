import java.util.Scanner;

public class Beecrowd3170 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balls = sc.nextInt();
        int branches = sc.nextInt();
        int needed = branches/2;

        if (needed <= balls) {
            System.out.println("Amelia tem todas bolinhas!");
        } else {

            int rest = (branches/2) - balls;
            System.out.println("Faltam " + rest + " bolinha(s)");
        }
    }
}
