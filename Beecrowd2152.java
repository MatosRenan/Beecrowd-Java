import java.util.Scanner;

public class Beecrowd2152 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nCases = sc.nextInt();
        int door;
        String hour, minute;
        for (int i = 0; i < nCases; i++) {

            hour = sc.next();
            minute = sc.next();
            door = sc.nextInt();

            hour = (hour.length() < 2 ? "0" + hour : hour);
            minute = (minute.length() < 2 ? "0" + minute : minute);

            System.out.printf("%s:%s - ", hour, minute);
            System.out.printf(door == 1 ? "A porta abriu!" : "A porta fechou!");
            System.out.println();
        }
    }
}
