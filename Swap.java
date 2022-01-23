package com.abhishek;

public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;


//        //swap number code
//        int temp=a;
//        a=b;
//        b=temp;
        swap(a,b);

        System.out.println(a+" "+b);
        String name =" Abhishek Dhole ";
        changName(name);
        System.out.println(name);
    }

    static void changName(String name) {
        name="ketan";

    }


    static  void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
