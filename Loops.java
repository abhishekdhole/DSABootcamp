package com.abhishek;


import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);


        /*
        Syntax of for loop:


         for (initialisation ; condition; increment/decrement){
            //body
         }
         */

        //Q: Print Number from 0 to 5

//       for (int num=1; num<=5; num++){
//           System.out.println(num);
//       }



        //Print Number 1 to n

//
//        int n =in.nextInt();
//        for (int num = 1; num <=n ; num++) {
//            System.out.println(num + " ");
//
//        }

//        while loop
        /*
        Syntax:
        while(condition){
        //body
        }

         */

        int num=1;
        while (num<=5){
//            System.out.println(num);
            num += 1;
        }

        //do while

        /*
            do {

            }while(condition);

         */

        int n=1;
        do{
            System.out.println(n);
            n++;

        }while (n<=5);
    }
}
