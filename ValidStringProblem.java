package Practice;

import java.util.Scanner;

public class ValidStringProblem {
    public static void main(String[] args) {
        int asterisk = 0;
        int hash = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        for (char ch: str.toCharArray()){
            if(ch == '*')
                asterisk++;
            else if (ch == '#' )
                hash++;

        }
        System.out.println(asterisk - hash);
    }
}
