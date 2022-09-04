package Practice;

import java.util.Scanner;

public class ChangeNumberEvenToOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int temp = number;
        int result = 0;


        while (temp != 0 || temp == 0){
            int rem = temp % 10;
            if(rem%2==0){
                rem= rem+1;
            }else {
                rem = rem - 1;
            }
            result=result+temp*rem;
            temp=temp/10;

        }
        int result1=0;
        while(result != 0){
            int rem1 =result %10;
            result1 =result1*10 +rem1;
            result =result / 10;
        }


    }

}
