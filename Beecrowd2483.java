import java.util.Scanner;

public class Beecrowd2483 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        StringBuilder felizNatal = new StringBuilder("Feliz nat");

        for (int i = 0; i < n; i++) {
            felizNatal.append("a");
        }

        felizNatal.append("l!");
        System.out.println(felizNatal);
    }
}
