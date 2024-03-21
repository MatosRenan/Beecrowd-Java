import java.util.Scanner;

public class Beecrowd2165 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String tweet = sc.nextLine();

        if (tweet.length() <= 140) {
            System.out.println("TWEET");
        }   else {
            System.out.println("MUTE");
        }
    }
}
