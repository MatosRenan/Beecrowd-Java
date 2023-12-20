import java.util.Scanner;
import java.text.DecimalFormat;

public class Beecrowd1040 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double n4 = input.nextDouble();

        double media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1)/10;

        System.out.println("Media: " + df.format(media));

        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5) {

            System.out.println("Aluno em exame.");

            double exam = input.nextDouble();
            double finalMedia = (exam + media)/2;

            System.out.println("Nota do exame: " + df.format(exam));
            if (finalMedia >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + df.format(finalMedia));
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}
