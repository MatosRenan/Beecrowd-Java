import java.util.Scanner;

public class Beecrowd1008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        double workedHour, valueHour, salary;

        number = input.nextInt();
        workedHour = input.nextDouble();
        valueHour = input.nextDouble();

        salary = workedHour * valueHour;

        System.out.printf("NUMBER = %d%n", number);
        System.out.printf("SALARY = U$ %.2f%n", salary);
    }
}
