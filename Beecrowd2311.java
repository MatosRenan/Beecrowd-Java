import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Beecrowd2311 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Populate the LinkedHashMap
        Map<String, Double> list = populateMap(sc, n);

        // Print the LinkedHashMap
        for (Map.Entry<String, Double> entry : list.entrySet()) {
            String name = entry.getKey();
            double score = entry.getValue();
            System.out.printf("%s %.2f\n", name, score);
        }
    }

    public static Map<String, Double> populateMap(Scanner sc, int n) {
        Map<String, Double> list = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            double high = -1, low = 11;
            String name = sc.next();
            double weight = sc.nextDouble();
            double finalScore = 0;

            for (int j = 0; j < 7; j++) {
                double score = sc.nextDouble();
                if (score > high) {
                    high = score;
                }
                if (score < low) {
                    low = score;
                }
                finalScore += score;
            }
            finalScore = (finalScore - high - low) * weight;
            list.put(name, finalScore);
        }
        return list;
    }
}
