package Practice;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number :");
        int num2 = sc.nextInt();

//        num1 = (num2-num1)+(num2=num1);
//        num1 = (num1 * num2) / (num2 = num1);
          num1 = (num2+num1)-(num2=num1);



        System.out.println("Swap Number :");

        System.out.println("First Number "+num1);
        System.out.println("Second Number " +num2);

    }
}
