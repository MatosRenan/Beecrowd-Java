public class Beecrowd2747 {
    public static void main(String[] args) {

        line();
        colunm();
        line();
    }

    public static void line () {

        for (int i = 0; i < 39; i++) {
            System.out.print('-');
        }
        System.out.println();
    }

    public static void colunm () {

        for (int i = 0; i < 5; i++) {
            System.out.print('|');
            for (int j = 0; j < 37; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
