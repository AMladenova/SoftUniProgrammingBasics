import java.util.Scanner;
/**
 * Created by Dr-Br on 26.1.2017 г..
 */
public class PersonalTitles {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double age = Double.parseDouble(console.nextLine());
        String gender = console.nextLine();

        if (gender.equals("f")) {
            if (age < 16) {
                System.out.println("Miss");
            } else {
                System.out.println("Ms.");
            }
        } else {
            if (gender.equals("m")) {
                if (age < 16) {
                    System.out.println("Master");
                } else {
                    System.out.println("Mr.");
                }
            }
        }
    }
}