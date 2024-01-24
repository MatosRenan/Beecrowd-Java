import java.util.Scanner;

public class Beecrowd1180 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] lista = new int[n];

        for (int i = 0; i < lista.length; i++) {

            int x = sc.nextInt();
            lista[i] = x;
        }

        int smaller = lista[0];
        int pos = 0;

        for (int i = 1; i < lista.length ; i++) {

            if (lista[i] < smaller) {
                smaller = lista[i];
                pos = i;
            }
        }
        System.out.println("Menor valor: " + smaller);
        System.out.println("Posicao: " + pos);
    }
}
