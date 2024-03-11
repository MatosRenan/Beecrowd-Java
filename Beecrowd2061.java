import java.util.Scanner;

public class Beecrowd2061 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nTabs = sc.nextInt();
        int nActions = sc.nextInt();

        for (int i = 0; i < nActions; i++) {

            String action = sc.next();

            if (action.equals("fechou")) {
                nTabs++;
            } else if (action.equals("clicou")) {
                nTabs--;
            }
        }

        System.out.println(nTabs);
    }
}
