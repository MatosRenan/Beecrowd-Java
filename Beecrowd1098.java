
public class Beecrowd1098 {
    public static void main(String[] args) {

        float i = 0, j = 1, soma = 0;
        int cont = 0;

        while (i <= 2.1) {

            if (i < 0.1 || i > 1.9 || i == 1) {
                System.out.printf("I=%.0f J=%.0f%n", i, j + soma);
            } else {
                System.out.printf("I=%.1f J=%.1f%n", i, j + soma);
            }

            j++;
            cont++;

            if (cont == 3) {
                i += 0.2;
                soma += 0.2;
                j = 1;
                cont = 0;
            }

        }
    }
}
