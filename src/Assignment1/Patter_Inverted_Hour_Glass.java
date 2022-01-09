package Assignment1;

import java.util.Scanner;

public class Patter_Inverted_Hour_Glass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = 5;
        int nsp = 2 * n - 1;
        n = n * 2 + 1;
        while(row <= n){
            int cst = 1;
            int num = 5;
            while (cst <= nst){
                System.out.print(num + " ");
                cst++;
                num--;
            }
            int csp = 1;
            while(csp <= nsp){
                System.out.print(csp + " ");
                csp++;
            }
            cst = 1;

            row++;
        }
    }
}
