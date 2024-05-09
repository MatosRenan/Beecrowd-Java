import java.util.Scanner;

public class Beecrowd2310 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int tSaque = 0, tBlock = 0, tAtaque = 0;
        double scoreSaque = 0, scoreBlock = 0, scoreAtaque = 0;

        for (int i = 0; i < n; i++) {

            sc.next();
            tSaque += sc.nextInt();
            tBlock += sc.nextInt();
            tAtaque += sc.nextInt();
            scoreSaque += sc.nextInt();
            scoreBlock += sc.nextInt();
            scoreAtaque += sc.nextInt();
        }
        System.out.printf("Pontos de Saque: %.2f %%\n", scoreSaque/tSaque*100);
        System.out.printf("Pontos de Bloqueio: %.2f %%\n", scoreBlock/tBlock*100);
        System.out.printf("Pontos de Ataque: %.2f %%\n", scoreAtaque/tAtaque*100);
    }

}
