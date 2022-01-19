package com.abhishek;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
//        float num = in.nextFloat();
//        int num =in.nextInt();
//        System.out.println(num);
        //Type Casting
//        int num =(int)(346.84f);
//        System.out.println(num);

        //automatic type promotion n expression
//
//        int a =257;
//        byte b= (byte)(a);
//
//        System.out.println(a);


//        byte a= 20;
//        byte b=40;
//        byte c=100;
//        int d=a*b/c;
//        System.out.println(d);


        byte b=45;
        char c ='a';
        short s =1024;
        int i=50000;
        float f =5.67f;
        double d= 34.52d;
        double result=(f*b)+(i/c)-(d-s);
        System.out.println((f*b)+ "    " +(i/c)+"     " +(d-s));
        System.out.println(result);

    }


}
