package Assignment1;

import java.util.Scanner;

public class Fibonacci_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 1;
        int num2 = 1;
        int n = sc.nextInt();
        int num3 = 0;
        int row = 3;
        int nst = 3;
        System.out.println(0);
        if (n >= 2) {
            System.out.println(1 + " " + 1);
            while (row <= n) {
                int cst = 1;
                while (cst <= nst) {
                    num3 = num1 + num2;
                    System.out.print(num3 + " ");
                    cst++;
                    num1 = num2;
                    num2 = num3;
                }
                System.out.println();
                row++;
                nst++;
            }
        }
    }
}
