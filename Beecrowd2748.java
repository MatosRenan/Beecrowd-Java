// showing some presentation error that i did not found why

public class Beecrowd2748 {
    public static void main(String[] args) {

        line();
        colunm();
        line();
    }

    public static void line() {

        for (int i = 0; i < 39; i++) {
            System.out.print('-');
        }
        System.out.println();
    }

    public static void colunm() {

        for (int i = 0; i < 5; i++) {
            System.out.print('|');
            for (int j = 0; j < 37; j++) {
                if (j == 10) {
                    j = word(i);
                }

                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static int word(int i) {

        if (i == 0) {
            System.out.print("Roberto");
            return 17;
        } else if (i == 2) {
            System.out.print("5786");
            return 14;
        } else if (i == 4) {
            System.out.print("UNIFEI");
            return 16;
        }
        return 10;
    }
}

