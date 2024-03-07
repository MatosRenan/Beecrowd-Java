import java.util.Scanner;

public class Beecrowd2057 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int departure = sc.nextInt();
        int timeTravel = sc.nextInt();
        int timeZone = sc.nextInt();
        int arrive = departure + timeTravel + timeZone;

        if (arrive >= 24) {
            System.out.println(arrive - 24);
        }   else if (arrive < 0){
            System.out.println(arrive + 24);
        }   else {
            System.out.println(arrive);
        }
    }
}
