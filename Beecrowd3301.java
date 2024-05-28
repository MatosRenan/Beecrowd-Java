import java.util.Arrays;
import java.util.Scanner;

public class Beecrowd3301 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int z = sc.nextInt();
        int l = sc.nextInt();
        int[] ages = {h, z, l};
        Arrays.sort(ages);

        if (z == ages[1]) {
            System.out.println("zezinho");
        } else if (h == ages[1]) {
            System.out.println("huguinho");
        } else if (l == ages[1]) {
            System.out.println("luisinho");
        }

    }
}
