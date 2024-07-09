import java.util.Scanner;

public class Beecrowd3214 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int e = sc.nextInt();
        int f = sc.nextInt();
        int c = sc.nextInt();

        int bottles = e + f;
        int cont = 0;

        while (bottles / c > 0) {

            cont += bottles / c;
            bottles = (bottles/c) + bottles % c;

        }

        System.out.println(cont);
    }
}
