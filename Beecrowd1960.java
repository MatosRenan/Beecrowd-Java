import java.util.Scanner;

public class Beecrowd1960 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int arabicNumber = sc.nextInt();
        StringBuilder romanNumber = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (arabicNumber >= values[i]) {
                romanNumber.append(numerals[i]);
                arabicNumber -= values[i];
            }
        }

        System.out.println(romanNumber);
    }
}