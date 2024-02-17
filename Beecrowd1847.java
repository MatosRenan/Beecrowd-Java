import java.util.Scanner;

public class Beecrowd1847 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int sec = sc.nextInt();
        int third = sc.nextInt();

        if (first > sec && sec <= third) {
            System.out.println(":)");
        } else if (first <= sec && sec < third && third - sec >= sec - first) {
            System.out.println(":)");
        } else if (first > sec && sec - third < first - sec) {
            System.out.println(":)");
        } else if (first == sec && sec < third) {
            System.out.println(":)");
        } else {
            System.out.println(":(");

        }
    }
}
