import java.util.*;

public class Beecrowd2235 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> num = new ArrayList<Integer>();

        for (int i = 0; i < 3; i++) {
            num.add(sc.nextInt());
        }
        Collections.sort(num);

        boolean possible = num.get(0) + num.get(1) == num.get(2) || Objects.equals(num.get(0), num.get(1)) ||
                Objects.equals(num.get(0), num.get(2)) || Objects.equals(num.get(1), num.get(2));

        if (possible) {
            System.out.println("S");
        }   else {
            System.out.println("N");
        }
    }
}
