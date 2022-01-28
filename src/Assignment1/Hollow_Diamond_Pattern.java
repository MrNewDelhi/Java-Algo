package Assignment1;

import java.util.Scanner;

public class Hollow_Diamond_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nsp = -1;
        int nst = (n + 1)/ 2;
        while(row <= n){
            int cst = 1;
            while(cst <= nst){
                System.out.print("*\t");
                cst++;
            }
            int csp = 1;
            while(csp <= nsp){
                System.out.print(" \t");
                csp++;
            }
            cst = 1;
            int nst_t = nst;
            if(row == 1 || row == n){
                nst_t = nst - 1;
            }
            while(cst <= nst_t){
                System.out.print("*\t");
                cst++;
            }
            row++;
            if(row <= (n+1)/2){
                nst--;
                nsp+=2;
            }
            else{
                nst++;
                nsp-=2;
            }
            System.out.println();
        }
    }
}
