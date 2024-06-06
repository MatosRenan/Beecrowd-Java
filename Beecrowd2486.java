import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Beecrowd2486 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> lista = new HashMap<>();

        lista.put("suco de laranja", 120);
        lista.put("morango fresco", 85);
        lista.put("mamao", 85);
        lista.put("goiaba vermelha", 70);
        lista.put("manga", 56);
        lista.put("laranja", 50);
        lista.put("brocolis", 34);

        int t = sc.nextInt();

        while (t != 0) {
            int vitamin = 0;
            for (int i = 0;  i < t; i++) {

                int amount = sc.nextInt();

                String food = sc.nextLine().trim();
                vitamin += lista.get(food) * amount;

            }
            if (vitamin >= 110 && vitamin <= 130) {
                System.out.println(vitamin + " mg");

            }   else if (vitamin < 110) {
                System.out.printf("Mais %d mg\n", 110 - vitamin);
            }   else {
                System.out.printf("Menos %d mg\n", vitamin - 130);
            }
            t = sc.nextInt();
        }
    }
}
