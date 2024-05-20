import java.util.Scanner;

public class Beecrowd3055 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int media = sc.nextInt();

        int n2 = media * 2 - n1;
        System.out.println(n2);
    }
}
