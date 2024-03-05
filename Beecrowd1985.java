import java.util.HashMap;
import java.util.Scanner;

public class Beecrowd1985 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Double> products = new HashMap<>();
        double total = 0;
        
        products.put("1001", 1.5);
        products.put("1002", 2.5);
        products.put("1003", 3.5);
        products.put("1004", 4.5);
        products.put("1005", 5.5);

        int nItems = sc.nextInt();

        for (int i = 0; i < nItems; i++) {

            String code = sc.next();
            int amount = sc.nextInt();

            total += products.get(code) * amount;
        }

        System.out.printf("%.2f%n",total);
    }
}
