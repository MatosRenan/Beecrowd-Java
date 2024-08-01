import java.util.*;

public class Beecrowd2663 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contestants = sc.nextInt();
        int minimum = sc.nextInt();
        int qualifiers;

        ArrayList<Integer> scores = new ArrayList<>();
        for (int i = 0; i < contestants; i++) {
            scores.add(sc.nextInt());
        }
        Collections.sort(scores, Comparator.reverseOrder());

        qualifiers = minimum;
        int scoreAux = scores.get(qualifiers - 1);

        for (int i = minimum; i < scores.size(); i++) {

            if (scoreAux == scores.get(i)) {
                qualifiers++;
            }   else {
                break;
            }
        }

        System.out.println(qualifiers);
    }
}
