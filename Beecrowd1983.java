import java.util.Scanner;

public class Beecrowd1983 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int nStudents = sc.nextInt(), registration,  choosen = 0;
        double score, highScore = 0;

        for (int i = 0; i < nStudents; i++) {

            registration = sc.nextInt();
            score = sc.nextDouble();

            if (score >= 8) {
                if (score > highScore) {
                    highScore = score;
                    choosen = registration;
                }
            }
        }
        if (choosen == 0) {
            System.out.println("Minimum note not reached");
        }   else {
            System.out.println(choosen);
        }

    }
}
