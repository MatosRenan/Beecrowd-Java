public class Beecrowd1096 {
    public static void main(String[] args) {

        int i = 1, j = 7;

        while (i <= 9) {

            System.out.printf("I=%d J=%d%n", i, j);
            j--;

            if (j == 4) {
                j = 7;
                i += 2;
            }
        }
    }
}
