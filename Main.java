package com.abhishek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        /*
        Syntax of if statements:
            if(boolean expression T or F) {
                 //body
            } else{
                 //do this
            }
         */

        int salary =10000;
//        if(salary > 4000){
//            salary =salary +2000;
//
//        } else{
//            salary =salary+1000;
//        }

        // multiple if -else
        if(salary>10000){
            salary +=2000; //salary =salary +2000
        }else if(salary >20000){
            salary += 3000;
        }else{
            salary +=1000;
        }
        System.out.println(salary);


    }
}
