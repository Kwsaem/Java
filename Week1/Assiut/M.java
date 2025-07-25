
import java.text.DecimalFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        if (c >= 48 && c <= 57) {
            System.out.println("IS DIGIT");
        }
        else if (c >= 65 && c <= 90) {
            System.out.println("ALPHA");
            System.out.println("IS CAPITAL");

        }

        else if (c >= 97 && c <= 122) {
            System.out.println("ALPHA");
            System.out.println("IS SMALL");
        }


    }
}