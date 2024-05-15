import java.util.Scanner;

public class Beecrowd2786 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        int lenght = sc.nextInt();

        double area = (width * lenght) - 0.5;
        int typeTwo = (lenght - 1) * 2  + (width - 1) * 2;
        double typeOne = (area - (typeTwo * 0.25))/0.5;
        System.out.printf("%.0f\n", typeOne);
        System.out.println(typeTwo);
    }
}
