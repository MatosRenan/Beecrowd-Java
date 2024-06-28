import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Beecrowd2653 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> jewelryTypes = new ArrayList<>();

        while (sc.hasNext()) {

            String jewelry = sc.nextLine();
            if (!(jewelryTypes.contains(jewelry))) {
                jewelryTypes.add(jewelry);
            }
        }
        System.out.println(jewelryTypes.size());
    }
}
