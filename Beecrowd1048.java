import java.util.Scanner;

public class Beecrowd1048 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salary = input.nextDouble();
        int increase = 0;

        if (salary > 0) {
            if (salary <= 400) {
                increase = 15;
            } else if (salary <= 800) {
                increase = 12;
            } else if (salary <= 1200) {
                increase = 10;
            } else if (salary <= 2000) {
                increase = 7;
            }   else {
                increase = 4;
            }
        }
        double increase_value = (double) increase /100 * salary;
        double new_salary = increase_value + salary;

        System.out.printf("Novo salario: %.2f%n", new_salary);
        System.out.printf("Reajuste ganho: %.2f%n", increase_value);
        System.out.printf("Em percentual: %d %% %n", increase);

    }
}
