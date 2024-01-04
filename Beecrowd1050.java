import java.util.Scanner;

public class Beecrowd1050 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Object[][] dddList = {
                {61, "Brasilia"},
                {71, "Salvador"},
                {11, "Sao Paulo"},
                {21, "Rio de Janeiro"},
                {32, "Juiz de Fora"},
                {19, "Campinas"},
                {27, "Vitoria"},
                {31, "Belo Horizonte"}
        };

        int dddnumber = input.nextInt();
        boolean found = false;

        for (Object[] list : dddList) {
            if (dddnumber == (int) list[0]) {
                System.out.println(list[1]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("DDD nao cadastrado");
        }
    }
}
