import java.util.Scanner;

public class Beecrowd3209 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int max = 0;
            int nPowerStrips = sc.nextInt();
            for (int j = 0; j < nPowerStrips; j++) {

                int nOutlets = sc.nextInt();
                max += nOutlets - 1;
            }
            max++;
            System.out.println(max);
        }
    }
}
