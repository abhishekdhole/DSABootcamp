package Practice;

import java.util.Scanner;

public class TCSFirstProblem {

        public static void main(String[] args)
        {
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            int m=in.nextInt();
            int x=in.nextInt();
            in.close();
            int last_customer =m*(n - 1);
            int last_customer_wait_duration = x * (n - 1);
            System.out.print(last_customer_wait_duration - last_customer);
        }

}
