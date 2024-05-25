import java.util.Scanner;

public class Beecrowd3161 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nFruit = sc.nextInt();
        int nLines = sc.nextInt();
        sc.nextLine();

        String[] fruits = new String[nFruit];
        String line = "";

        for (int i = 0; i < nFruit; i++) {
            fruits[i]  = sc.next().toLowerCase();
        }
        sc.nextLine();

        for (int i = 0; i < nLines; i++) {
            line = line.concat(sc.nextLine().toLowerCase());
        }

        for (String fruit : fruits) {
            StringBuilder invertedFruit = new StringBuilder(fruit);
            invertedFruit.reverse();

            if (line.contains(fruit) || line.contains(invertedFruit)) {
                System.out.println("Sheldon come a fruta " + fruit);
            }   else {
                System.out.println("Sheldon detesta a fruta " + fruit);
            }
        }
        System.out.println(line);
    }
}
