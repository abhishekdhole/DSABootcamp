package com.abhishek;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Class Number :");
        int rollNo = in.nextInt();
        int num1 =in.nextInt();
        int num2 =in.nextInt();
        int sum =num1+num2;
        System.out.println(sum);
        System.out.println("Your Roll Number is "+ rollNo);


    }
}
