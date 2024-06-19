import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Beecrowd2582 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Integer, String> playlist = new HashMap<>();

        playlist.put(0, "PROXYCITY");
        playlist.put(1, "P.Y.N.G.");
        playlist.put(2, "DNSUEY!");
        playlist.put(3, "SERVERS");
        playlist.put(4, "HOST!");
        playlist.put(5, "CRIPTONIZE");
        playlist.put(6, "OFFLINE DAY");
        playlist.put(7, "SALT");
        playlist.put(8, "ANSWER!");
        playlist.put(9, "RAR?");
        playlist.put(10, "WIFI ANTENNAS");

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            int song = x + y;

            for (Integer key : playlist.keySet()
                 ) {
                if (song == key) {
                    System.out.println(playlist.get(key));
                }
            }
        }
    }
}
