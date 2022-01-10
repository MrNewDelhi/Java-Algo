package Assignment1;

import java.util.Scanner;

public class Pattern_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nsp = n - 1;
        int nst = 1;
        n = (2 * n) - 1;
        while(row <= n){
            int csp = 1;
            while(csp <= nsp){
                System.out.print(" \t");
                csp++;
            }
            int cst = 1;
            int num = row;
            while(cst <= nst){
                System.out.print(num + "\t");
                cst++;
                num++;
            }
                cst = 2;
                num = row;
                while (cst <= nst) {
                    System.out.print(num + "\t");
                    cst++;
                    num--;
                }
            row++;
            if(row < n/2 + 1){
                nst++;
                nsp--;
            }
            else{
                nst--;
                nsp++;
            }
            System.out.println();
        }
    }
}
