import java.util.Scanner;

public class Beecrowd1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int typeFuel = sc.nextInt();
        int alcohol = 0, diesel = 0, gasoline = 0;

        while (typeFuel != 4) {

            switch (typeFuel) {
                case 1 -> alcohol++;
                case 2 -> gasoline++;
                case 3 -> diesel++;
            }
            typeFuel = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcohol);
        System.out.println("Gasolina: " + gasoline);
        System.out.println("Diesel: " + diesel);
    }
}
