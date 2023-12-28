import java.util.Scanner;

public class Beecrowd1044 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        boolean multiple = a % b == 0 || b % a == 0;

        if (multiple) {
            System.out.println("Sao Multiplos");
        }   else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
