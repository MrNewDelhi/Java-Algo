package Assignment1;

import java.util.Scanner;

public class Hollow_Rhombus_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nsp = n-1;
        int nst = n;
        while(row <= n){
            int csp = 1;
            while(csp <= nsp){
                System.out.print(" ");
                csp++;
            }
            int cst = 1;
            if(row == 1 || row == n) {
                while (cst <= nst) {
                    System.out.print("*");
                    cst++;
                }
            }
            else {
                while (cst <= nst) {
                    if (cst == 1 || cst == nst) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    cst++;
                }
            }
            System.out.println();
            row++;
            nsp--;
        }
    }
}
