import java.util.Scanner;

public class Beecrowd1018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int value = input.nextInt();
        int totalvalue = value;

        int n100 = value/100;
        value -= n100 * 100;

        int n50 = value/50;
        value -= n50 * 50;

        int n20 = value/20;
        value -= n20 * 20;

        int n10 = value/10;
        value -= n10 * 10;

        int n5 = value/5;
        value -= n5 * 5;

        int n2 = value/2;
        value -= n2 * 2;

        int n1  = value;

        System.out.println(totalvalue);
        System.out.printf("""
                %d nota(s) de R$ 100,00
                %d nota(s) de R$ 50,00
                %d nota(s) de R$ 20,00
                %d nota(s) de R$ 10,00
                %d nota(s) de R$ 5,00
                %d nota(s) de R$ 2,00
                %d nota(s) de R$ 1,00""", n100, n50, n20, n10, n5, n2, n1);

    }
}
