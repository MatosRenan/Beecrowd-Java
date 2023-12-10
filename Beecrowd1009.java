import java.util.Scanner;

public class Beecrowd1009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        double fixSalary, totalSales, totalSalary;

        name = input.next();
        fixSalary = input.nextDouble();
        totalSales = input.nextDouble();

        totalSalary = fixSalary + (totalSales * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", totalSalary);
    }
}
