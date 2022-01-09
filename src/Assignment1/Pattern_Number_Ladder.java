package Assignment1;

import java.util.Scanner;

public class Pattern_Number_Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int num = 1;
        while(row <= n){
            int cst = 1;
            while(cst <= row){
                System.out.print(num+"\t");
                num++;
                cst++;
            }
            System.out.println();
            row++;
        }
    }
}
