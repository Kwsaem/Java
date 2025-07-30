package Week2.Assiut;

import java.util.Scanner;

public class P {
    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String num1 = str.substring(0,1);


        int A = Integer.parseInt(num1);

        if (A % 2==0) {
            System.out.println("EVEN");
        }
        if (A % 2 ==1) {
            System.out.println("ODD");
        }
    }
}


