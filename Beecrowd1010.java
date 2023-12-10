import java.util.Scanner;

public class Beecrowd1010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int prod1, prod2, amountProd1, amountProd2;
        double priceProd1, priceProd2, total;

        System.out.println("Produto 1: Nome / Quantidade / Preço");
        prod1 = input.nextInt();
        amountProd1 = input.nextInt();
        priceProd1 = input.nextDouble();

        System.out.println("Produto 2: Nome / Quantidade / Preço");
        prod2 = input.nextInt();
        amountProd2 = input.nextInt();
        priceProd2 = input.nextDouble();

        total = (priceProd1 * amountProd1) + (priceProd2 * amountProd2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }
}
