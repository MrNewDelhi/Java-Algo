package Assignment1;

import java.util.Scanner;

public class Pattern_with_Zeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = 1;
        while(row <= n){
            int cst = 1;
            while(cst <= nst) {
                if (cst == 1 || cst == nst) {
                    System.out.print(row + "\t");
                }
                else{
                    System.out.print("0\t");
                }
                    cst++;
            }
            System.out.println();
            row++;
            nst++;
        }
    }
}
