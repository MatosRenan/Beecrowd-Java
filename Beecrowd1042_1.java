import java.util.*;

public class Beecrowd1042_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int[] numbers = {a, b, c};
        int[] sortedNumbers = {a, b, c};

        for (int i = 0; i < sortedNumbers.length; i++) {

            for (int j = 0; j < sortedNumbers.length - 1; j++) {
                if (sortedNumbers[j] > sortedNumbers[j + 1]) {
                    int aux = sortedNumbers[j];
                    sortedNumbers[j] = sortedNumbers[j + 1];
                    sortedNumbers[j + 1] = aux;
                }
            }
        }

        for (int nume: sortedNumbers) {
            System.out.println(nume);
        }
        System.out.println();
        for (int num: numbers) {
            System.out.println(num);
        }
    }
}

