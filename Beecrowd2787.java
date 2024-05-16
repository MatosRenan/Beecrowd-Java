import java.util.Scanner;

public class Beecrowd2787 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        int colunm = sc.nextInt();

        int[][] matriz = matrizGenerator(line, colunm);

        System.out.println(matriz[line - 1][colunm - 1]);

    }

    public static int[][] matrizGenerator (int line, int column) {

        int aux = 0;
        int[][] matriz = new int[line][column];

        for (int i = 0; i < line; i++) {

            for (int j = 0; j < column; j++) {
                if ((i + j) % 2 == 0) {
                    matriz[i][j] = 1;
                }

            }

        }
        return matriz;
    }


}
