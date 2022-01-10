package Assignment1;

import java.util.Scanner;

public class Pattern_Magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nsp = -1;
        int nst = n;
        n = n * 2 - 1;
        while(row <= n){
            int cst = 1;
            while(cst <= nst){
                System.out.print("*");
                cst++;
            }
            int csp = 1;
            while(csp <= nsp){
                System.out.print(" ");
                csp++;
            }
            cst = 1;
            if(row == 1 || row == n){
                cst = 2;
            }
            while(cst <= nst){
                System.out.print("*");
                cst++;
            }
            row++;
            if(row <= n/2+1) {
                nsp+=2;
                nst--;
            }
            else{
                nsp-=2;
                nst++;
            }
            System.out.println();

        }
    }
}
