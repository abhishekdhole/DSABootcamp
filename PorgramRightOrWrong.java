package Practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PorgramRightOrWrong {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        //Take String Input

        String  str = sc.nextLine();
        int count1 =0;
        int count2 =0;

        for(int i =0; i<str.length(); i++){
            if('}' == str.charAt(i)){
                count1++;
            }
            if ('{' == str.charAt(i)){
                count2++;
            }

        }
        if(count1==count2){
            System.out.println("Correct");
        }else{
            System.out.println("Error");
        }
    }
}
