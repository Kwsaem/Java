import java.util.Scanner;

public class O {
    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        char[] signs = {'+', '-', '/', '*'};

        for (char sign : signs) {
            int index1 = str.indexOf(sign);
            if (index1 != -1) {
//                System.out.println(index1);

                String num1 = str.substring(0, index1);
                String num2 = str.substring(index1 + 1);

                int A = Integer.parseInt(num1);
                int B = Integer.parseInt(num2);


                if (sign == '+') {
                    System.out.println(A + B);
                }
                if (sign == '-') {
                    System.out.println(A - B);

                }
                if (sign == '/') {
                    System.out.println(A / B);

                }
                if (sign == '*') {
                    {
                        System.out.println(A * B);

                    }
                }
            }
        }
    }
}
