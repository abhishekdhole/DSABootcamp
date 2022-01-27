package com.abhishek;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Largest of Three");
        System.out.println("Please Enter the First Number :");
        int first =in.nextInt();
        System.out.println("Please Enter the Second Number :");
        int Second =in.nextInt();
        System.out.println("Please Enter the Third Number :");
        int Third =in.nextInt();

        int largest=largest(first,Second,Third);
        int smallest=smallest(first,Second,Third);
        System.out.printf("largest of three numbers %d, %d, and %d is : %d %n", first, Second, Third, largest);
        System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n", first, Second, Third, smallest);




    }
    public static int largest(int first,int Second, int Third){
        int max= first;
        if(Second>max){
            max=Second;

        }
        if(Third>max){
            max=Third;
        }
        return  max;
    }

    public static int smallest(int first, int Second, int Third) {
        int min = first;
        if (Second < min) {
            min = Second;
        }
        if (Third < min) {
            min = Third;
        }

        return min;
    }


}
