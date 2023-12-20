import java.util.Scanner;

public class Beecrowd1041 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();
        double y = input.nextDouble();
        String pos;

        if (x > 0 && y > 0) {
            pos = "Q1";

        } else if (x > 0 && y < 0) {
            pos = "Q4";
        } else if (x != 0 && y == 0) {
            pos = "Eixo X";
        }  else if (x < 0 && y > 0){
            pos = "Q2";
        } else if (x < 0 && y < 0) {
            pos = "Q3";
        } else if (x == 0 && y != 0){
            pos = "Eixo Y";
        } else {
            pos = "Origem";
        }
        System.out.println(pos);
    }
}
