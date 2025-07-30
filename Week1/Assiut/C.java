package Week1.Assiut;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();

        System.out.println(x + " + " + y + " = " + (x+y));
        System.out.println(x + " * " + y + " = " + x*y);
        System.out.println(x + " - " + y + " = " + (x-y));

    }
}