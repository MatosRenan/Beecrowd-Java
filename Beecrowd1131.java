import java.util.Scanner;

public class Beecrowd1131 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int newTest = 1, grenais = 0, interWin = 0, gremioWin = 0, draws = 0;

        while (newTest == 1) {

            int interGoals = sc.nextInt();
            int gremioGoals = sc.nextInt();

            if (interGoals > gremioGoals) {
                interWin++;
            } else if (interGoals < gremioGoals) {
                gremioWin++;
            }   else {
                draws++;
            }

            grenais++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            newTest = sc.nextInt();

            while (newTest != 1 && newTest != 2) {
                System.out.println("Novo grenal (1-sim 2-nao)");
                newTest = sc.nextInt();
            }
        }
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + interWin);
        System.out.println("Gremio:" + gremioWin);
        System.out.println("Empates:" + draws);

        if (interWin > gremioWin) {
            System.out.println("Inter venceu mais");
        } else if (interWin < gremioWin) {
            System.out.println("Gremio venceu mais");
        }   else {
            System.out.println("Não houve vencedor");
        }
    }
}
