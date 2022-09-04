package Practice;

import java.util.Scanner;

public class FullPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows,k;
        rows=sc.nextInt();
        k=0;
        for (int i =rows; i>=1; ++i,k=0){
            for(int space =1; space <= rows -i; ++space){
                System.out.print("  ");
            }
            while (k!=2*i-1){
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
    }
}
