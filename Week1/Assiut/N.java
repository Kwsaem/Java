
import java.text.DecimalFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);


        if (c >= 65 && c <= 90) {
            System.out.println((char) (c+32));


        }

        else if (c >= 97 && c <= 122) {
            System.out.println((char) (c-32));

        }


    }
}