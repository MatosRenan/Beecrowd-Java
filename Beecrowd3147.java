import java.util.Scanner;

public class Beecrowd3147 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt(), e = sc.nextInt(), a = sc.nextInt();
        int o = sc.nextInt(), w = sc.nextInt(), x = sc.nextInt();

        int good = h + e + a + x;
        int evil = o + w;

        if (good >= evil) {
            System.out.println("Middle-earth is safe.");
        }   else {
            System.out.println("Sauron has returned.");
        }
    }
}
