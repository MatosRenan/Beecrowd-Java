import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1049 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String bones = input.next().toLowerCase().trim();
        String birth = input.next().toLowerCase().trim();
        String diet = input.next().toLowerCase().trim();
        String animal = "";

        if (bones.equals("vertebrado")) {
            if (birth.equals("ave")) {
                if (diet.equals("carnivoro")) {
                    animal = "aguia";
                } else if (diet.equals("onivoro")) {
                    animal = "pomba";
                }

            } else if (birth.equals("mamifero")) {
                if (diet.equals("onivoro")) {
                    animal = "homem";
                } else if (diet.equals("herbivoro")) {
                    animal = "vaca";
                }
            }

        }

        if (bones.equals("invertebrado")) {
            if (birth.equals("inseto")) {
                if (diet.equals("hematofago")) {
                    animal = "pulga";
                } else if (diet.equals("herbivoro")) {
                    animal = "lagarta";
                }
            } else if (birth.equals("anelideo")) {
                if (diet.equals("hematofago")) {
                    animal = "sanguessuga";
                } else if (diet.equals("onivoro")) {
                    animal = "minhoca";
                }
            }
        }
        System.out.println(animal);
    }
}
