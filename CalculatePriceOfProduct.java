package Practice;

import java.util.Scanner;

public class CalculatePriceOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int prod =1;

        while (number == 0){
            System.out.println(number);
            System.exit(0);
        }
        while (number != 0){
            prod *= number % 10;
            number /= 10;
        }
        System.out.println(prod);
    }
}
