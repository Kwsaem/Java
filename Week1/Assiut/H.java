package Week1.Assiut;

import java.text.DecimalFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c= Math.floor(a/b);
        double d= Math.ceil(a/b);
        double f= Math.round(a/b);
        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println("floor " + df.format(a) + " / " + df.format(b) + " = " + df.format(c) );
        System.out.println("ceil " + df.format(a) + " / " + df.format(b) + " = " + df.format(d) );
        System.out.println("round " + df.format(a) + " / " + df.format(b) + " = " + df.format(f) );

    }
}