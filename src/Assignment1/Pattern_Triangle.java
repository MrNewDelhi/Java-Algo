package Assignment1;

import java.util.Scanner;

public class Pattern_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n - 1;
        int nst = 1;
        int row = 1;
        while(row <= n){
            int csp = 1;
            while(csp <= nsp){
                System.out.print("   ");
                csp++;
            }
            int cst = 1;
            int num = row;
            while(cst <= nst){
                System.out.print(num + "  ");
                cst++;
                num++;
            }
            num-=2;
            cst = 1;
            while(cst < nst){
                System.out.print(num + "  ");
                cst++;
                num--;
            }
            System.out.println();
            row++;
            nst++;
            nsp--;
        }
    }
}
