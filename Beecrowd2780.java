import java.util.Scanner;

public class Beecrowd2780 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dist = sc.nextInt();
        int section;

        if (dist <= 800) {
            section = 1;
        } else if (dist <= 1400) {
            section = 2;
        } else {
            section = 3;
        }

        System.out.println(section);
    }
}
