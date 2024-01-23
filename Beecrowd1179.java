import java.util.ArrayList;
import java.util.Scanner;

public class Beecrowd1179 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < 15; i++) {

            int x = sc.nextInt();
            
            if(x % 2 == 0) {
                even.add(x);
            }   else {
                odd.add(x);
            }
            
            if (even.size() == 5) {
                for (int j = 0; j < even.size(); j++) {
                    System.out.printf("par[%d] = %d%n", j, even.get(j));
                }
                even.clear();
            }

            if (odd.size() == 5) {
                for (int j = 0; j < odd.size(); j++) {
                    System.out.printf("impar[%d] = %d%n", j, odd.get(j));
                }
                odd.clear();
            }
        }

        for (int j = 0; j < odd.size(); j++) {
            System.out.printf("par[%d] = %d%n", j, odd.get(j));
        }
        for (int j = 0; j < even.size(); j++) {
            System.out.printf("impar[%d] = %d%n", j, even.get(j));
        }
    }
}
