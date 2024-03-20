import java.util.Scanner;

public class Beecrowd2164 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double fibonacci = (Math.pow((1+Math.sqrt(5))/2, n) - Math.pow((1 - Math.sqrt(5))/2, n)) / Math.sqrt(5);

        System.out.printf("%.1f%n",fibonacci);
    }
}
