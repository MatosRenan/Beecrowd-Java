public class Beecrowd1097 {
    public static void main(String[] args) {

        int i = 1, j = 7, cont = 0;

        while (i <= 9) {

            System.out.printf("I=%d J=%d%n", i, j);
            j--;
            cont++;

            if (cont == 3) {
                i += 2;
                j += 5;
                cont = 0;
            }
        }
    }
}
