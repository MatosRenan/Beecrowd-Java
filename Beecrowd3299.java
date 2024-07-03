import java.util.Scanner;

public class Beecrowd3299 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n  = sc.next();

        if (n.contains("13")) {
            System.out.println(n + " es de Mala Suerte");
        }   else {
            System.out.println(n + " NO es de Mala Suerte");
        }
    }
}
