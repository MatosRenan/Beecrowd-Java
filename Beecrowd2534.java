import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Beecrowd2534 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int nCitizens = sc.nextInt();
            int nQueries = sc.nextInt();
            int queries;
            Integer[] citizens = new Integer[nCitizens];

            for (int i = 0; i < nCitizens; i++) {
                citizens[i] = sc.nextInt();
            }
            Arrays.sort(citizens, Collections.reverseOrder());
            for (int i = 0; i < nQueries; i++) {
                queries = sc.nextInt() - 1;
                System.out.println(citizens[queries]);
            }
        }
    }
}
