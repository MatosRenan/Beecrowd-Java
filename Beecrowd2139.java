
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Beecrowd2139 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int month = sc.nextInt();
            int day = sc.nextInt();

            LocalDate givenDate = LocalDate.of(LocalDate.now().getYear(), month, day);

            LocalDate christmasDay = LocalDate.of(LocalDate.now().getYear(), 12, 25);

            long daysToChristmas = christmasDay.until(givenDate, ChronoUnit.DAYS);

            if (daysToChristmas == 0) {
                System.out.println("E natal!");
            } else if (daysToChristmas == -1) {
                System.out.println("E vespera de natal!");
            } else if (daysToChristmas > 0) {
                System.out.println("Ja passou!");
            }   else {
                System.out.println("Faltam " + Math.abs(daysToChristmas) + " dias para o natal!");
            }
        }

    }
}
