package Practice;

import java.util.Scanner;

public class ValueOFN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 20;
        int s =0;

        int f= 1;
        int i =1;

        while(i<=n){
            f=f*i;
            s=s+(i/f);
            i+=1;
        }

    }



}
