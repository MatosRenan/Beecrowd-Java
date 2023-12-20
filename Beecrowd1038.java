import java.util.Scanner;

public class Beecrowd1038 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] products = new double[5][5];

        products[0][1] = 4;
        products[1][1] = 4.5;
        products[2][1] = 5;
        products[3][1] = 2;
        products[4][1] = 1.5;

        double totalValue = 0;

        System.out.println("Enter the product code:");
        int productCode = input.nextInt() - 1;
        System.out.println("Enter the amount:");
        int amount = input.nextInt();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == productCode) {
                    totalValue += products[i][j] * amount;
                }
            }
        }
        System.out.println("Total R$: " + totalValue);
    }
}