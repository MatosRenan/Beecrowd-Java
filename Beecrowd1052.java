import java.util.Scanner;

public class Beecrowd1052 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Object[][] months_of_year = {
                {1, "January"},
                {2, "February"},
                {3, "March"},
                {4, "April"},
                {5, "May"},
                {6, "June"},
                {7, "July"},
                {8, "August"},
                {9, "September"},
                {10, "October"},
                {11, "November"},
                {12, "December"}
        };

        int number_month = input.nextInt();

        for (Object[] months : months_of_year) {
            if (number_month == (int) months[0]) {
                System.out.println(months[1]);
                break;
            }
        }
    }
}
