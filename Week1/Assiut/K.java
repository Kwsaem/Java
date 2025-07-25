
import java.text.DecimalFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int  c = sc.nextInt();

        if(a>=b&&a<=c||a<=b&&a>=c){
            if (b>c) {

                System.out.println(c + " " + b);
            }
            else {
                System.out.println(b + " " + c);
            }
        } else if (b>=a&&b<=c || b<=a&&b>=c) {
            if (a>c) {
                System.out.println(c + " " + a);
            }
            else {
                System.out.println(a + " " + c);
            }
        } else {
            if (a<b) {
                System.out.println(a+ " "+ b);
            }
            else {
                System.out.println(b+ " "+ a);
            }

        }
    }

}