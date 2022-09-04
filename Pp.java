package Practice;

import java.util.Scanner;

public class Pp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum =0;
        int temp = num;

        while (num > 0){
            int rem = num % 10;
            sum = sum * 10 + rem;
            num /= 10;
        }
        num= temp;
        if(num == sum){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
