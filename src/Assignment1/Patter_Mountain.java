package Assignment1;

import java.util.Scanner;

public class Patter_Mountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = 1;
        int nsp = n + 1;
        while(row <= n){
            int cst = 1;
            while(cst <= nst){
                System.out.print(cst + "\t");
                cst++;
            }
            int csp = 1;
            while(csp <= nsp){
                System.out.print("\t");
                csp++;
            }
            cst = row;
            if(row == n){
                cst -=1;
            }
            while(cst > 0){
                System.out.print(cst + "\t");
                cst--;
            }
            nsp-=2;
            row++;
            nst++;
            System.out.println();
        }
    }
}
