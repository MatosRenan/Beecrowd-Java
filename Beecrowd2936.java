import java.util.Scanner;

public class Beecrowd2936 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] grams = {300, 1500, 600, 1000, 150};

        int total = 0;
        int portion;
        for (int i = 0; i < 5; i++) {

            portion = sc.nextInt();
            total += portion * grams[i];
        }
        total += 225;
        System.out.println(total);
    }
}
