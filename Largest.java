package com.abhishek;

import java.awt.*;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        //Q: Find the largest of the 3 number

//        int max=a;
//        if(b>max){
//            max =b;
//
//        }
//        System.out.println(max);
//
//        int max =0;
//        if(a>b){
//            max=a;
//        }else {
//            max =b;
//        }
//
//        if(c>max){
//            max =c;
//        }
        int max=Math.max(c, Math.max(a,b));
        System.out.println(max);
    }
}
