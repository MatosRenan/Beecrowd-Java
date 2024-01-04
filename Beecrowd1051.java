import java.util.Scanner;

public class Beecrowd1051 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salary = input.nextDouble();
        double final_salary;

        if (salary > 2000) {
            if (salary <= 3000) {
                final_salary = (salary - 2000) * 0.08;
            }
            else if (salary <= 4500) {
                final_salary = (salary - 3000) * 0.18 + 80;
            }
            else {
                final_salary = (salary - 4500) * 0.28 + 350;
            }
            System.out.printf("R$ %.2f%n", final_salary);
        }  else {
            System.out.println("Isento");
        }

    }
}
