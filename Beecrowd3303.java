import java.util.Scanner;

public class Beecrowd3303 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        if (word.length() >= 10) {
            System.out.println("palavrao");
        }   else {
            System.out.println("palavrinha");
        }
    }
}
