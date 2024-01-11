import java.util.Scanner;

public class Beecrowd1094 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int coelho = 0, rato = 0, sapo = 0, total = 0;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int amount = sc.nextInt();
            String type = sc.next().toUpperCase();


            switch (type) {
                case "C" -> {
                    coelho += amount;
                }
                case "R" -> {
                    rato += amount;
                }
                case "S" -> {
                    sapo += amount;
                }
            }
            total += amount;
        }

        double percentCoelho = (double) coelho /total * 100;
        double percentRato = (double) rato /total * 100;
        double percentSapo = (double) sapo /total * 100;

        String formattedString = String.format(
                "Total: %d cobaias%n" +
                "Total de coelhos: %d%n" +
                "Total de ratos: %d%n" +
                "Total de sapos: %d%n" +
                "Percentual de coelhos: %.2f %%%n" +
                "Percentual de ratos: %.2f %%%n" +
                "Percentual de sapos: %.2f %%", total, coelho, rato, sapo, percentCoelho, percentRato, percentSapo);

        System.out.println(formattedString);
    }
}
