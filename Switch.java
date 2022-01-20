package com.abhishek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit =in.next();
//    Old Factions


//        if(fruit.equals("mango")){
//            System.out.println("King of Fruit" );
//        }
//        if(fruit.equals("apple")){
//            System.out.println("A sweet fruit");
//        }

//        Switch Case Method


        switch (fruit) {
            case "Mango":
                System.out.println("King of Fruit");
                break;
            default:
                if ("Apple".equals(fruit)) {
                    System.out.println("Sweet Love");
                } else {
                    System.out.println("Hey !!!");
                }
                break;
        }

    }
}
