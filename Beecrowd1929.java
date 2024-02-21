import java.util.Scanner;

public class Beecrowd1929 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int l1 = sc.nextInt(), l2 = sc.nextInt(), l3 = sc.nextInt(), l4 = sc.nextInt();

        if (isTriangle(l1, l2, l3) || isTriangle(l2, l3, l4) || isTriangle(l3, l4, l1) || isTriangle(l4, l1, l2)) {
            System.out.println("S");
        }   else {
            System.out.println("N");
        }
    }
    private static boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (b + c > a) && (a + c > b);
    }
}
