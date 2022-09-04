package Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Sudo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =1;
        int b =2;
        for (int i =0 ; i<=6; i=i+2){
            a= a+b+i;
            a= a+b;
            b= a-b;
            System.out.println(b);

        }

    }
}
