package Week1.Assiut;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();

        if(a%b==0){
            System.out.println("Multiples");

        } else if (b%a==0) {
            System.out.println("Multiples");
        } else {
            System.out.println("No Multiples");
        }
    }

}