import java.util.Scanner;

public class Beecrowd1021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double value = input.nextDouble();
        double totalvalue = value;

        int n100 = (int) (value/100);
        value -= n100 * 100;

        int n50 = (int) (value/50);
        value -= n50 * 50;

        int n20 = (int) (value/20);
        value -= n20 * 20;

        int n10 = (int) (value/10);
        value -= n10 * 10;

        int n5 = (int) (value/5);
        value -= n5 * 5;

        int n2 = (int) (value/2);
        value -= n2 * 2;

        int n1  = (int) value;
        value -= n1;
        value *= 100;

        int n050 = (int) value;
        value -= n050 * 50;

        int n025 = (int) value;
        value -= n025 * 25;

        int n010 = (int) (value/10);
        value -= n010 * 10;

        int n005 = (int) (value/5);
        value -= n005 * 5;

        int n001 = (int) (value);

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00%n", n100);
        System.out.printf("%d nota(s) de R$ 50.00%n", n50);
        System.out.printf("%d nota(s) de R$ 20.00%n", n20);
        System.out.printf("%d nota(s) de R$ 10.00%n", n10);
        System.out.printf("%d nota(s) de R$ 5.00%n",n5);
        System.out.printf("%d nota(s) de R$ 1.00%n", n2);
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00%n", n1);
        System.out.printf("%d moeda(s) de R$ 0.50%n", n050);
        System.out.printf("%d moeda(s) de R$ 0.25%n", n025);
        System.out.printf("%d moeda(s) de R$ 0.10%n", n010);
        System.out.printf("%d moeda(s) de R$ 0.05%n", n005);
        System.out.printf("%d moeda(s) de R$ 0.01%n", n001);
        }
    }