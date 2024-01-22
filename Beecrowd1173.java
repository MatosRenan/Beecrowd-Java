import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Beecrowd1173 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        
        int first = sc.nextInt();

        for (int i = 0; i < 10; i++) {

            lista.add(first);
            System.out.printf("N[%d] = %d%n", i, lista.get(i));
            first *= 2;
        }
        
    }
}
