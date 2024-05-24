import java.util.Scanner;

public class Beecrowd3174 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int dolls = 0, architects = 0, musicians = 0, drawners = 0, total;

        for (int i = 0; i < n; i++) {

            String name = sc.next();
            String toy = sc.next();
            int time = sc.nextInt();
            if (toy.equals("bonecos")) {
                dolls += time;
            } else if (toy.equals("arquitetos")) {
                architects += time;
            } else if (toy.equals("musicos")) {
                musicians += time;
            } else if (toy.equals("desenhistas")) {
                drawners += time;
            }
        }

        total = dolls/8 + architects/4 + musicians/6 + drawners/12;
        System.out.println(total);
    }
}
