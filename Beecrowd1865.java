import java.util.Scanner;

public class Beecrowd1865 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int force;
        String name;

        for (int i = 0; i < c; i++) {

            name = sc.next();
            force = sc.nextInt();

            if (name.equals("Thor")) {
                System.out.println("Y");
            }   else {
                System.out.println("N");
            }
        }
    }
}
