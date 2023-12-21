import java.util.*;

public class Beecrowd1042 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int[] numbers = {a, b, c};

        List<Integer> sortedNumbers = new ArrayList<>();

        for (int num : numbers) {
            sortedNumbers.add(num);
        }

        Collections.sort(sortedNumbers);

        for (int num: sortedNumbers
             ) {
            System.out.println(num);
        }
        System.out.println();
        for (int num: numbers
             ) {
            System.out.println(num);
        }

    }
}
