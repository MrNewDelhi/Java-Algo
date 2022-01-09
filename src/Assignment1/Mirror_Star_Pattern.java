package Assignment1;

import java.util.Scanner;

public class Mirror_Star_Pattern {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nsp = n - 1;
        int nst = 1;
        while(row <= n) {
            int csp = 1;
            while(csp <= nsp){
                System.out.print("  ");
                csp++;
            }
            int cst = 1;
            while(cst <= nst){
                System.out.print("* ");
                cst++;
            }
            if(row < (n/2)+1){
                nst+=2;
                nsp--;
            }
            else{
                nst-=2;
                nsp++;
            }
            System.out.println();
            row++;
        }
    }
}*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nsp = n/2 - row + 1;
        int nst = 1;
        while(row <= n) {
            int csp = 1;
            while(csp <= nsp){
                System.out.print("  ");
                csp++;
            }
            int cst = 1;
            while(cst <= nst){
                System.out.print("* ");
                cst++;
            }
            if(row < (n/2)+1){
                nst+=2;
                nsp--;
            }
            else{
                nst-=2;
                nsp++;
            }
            System.out.println();
            row++;
        }
    }
}