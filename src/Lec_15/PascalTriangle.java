package Lec_15;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 0;
        int nsp = n * (n-1) - 1;
        while(row < n){
            if(n == 2 && row == 0){
                nsp = 2;
            }
            int csp = 1;
            while(csp <= nsp){
                System.out.print(" ");
                csp++;
            }
            int j = 0;
            while(j <= row) {
                System.out.print(fact(row) / (fact(j) * fact(row - j)) + "   ");
                j++;
            }
            System.out.println();
            row++;
            nsp-=2;
        }
    }
    public static int fact(int n){
        int i = 1;
        int factorial = 1;
        while(i <= n){
            factorial *= i;
            i++;
        }
        return factorial;
    }
}
//           1
//         1   1
//       1   2   1
//     1   3   3   1