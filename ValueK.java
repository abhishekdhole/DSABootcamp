package Practice;

import java.util.Scanner;

public class ValueK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,j,k,n;
        j=1;
        k=1;
        for(i =1; i<=5;i++){
            System.out.println(k);
            j=j+1;
            k=k+j;
        }
    }
}
