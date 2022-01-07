package Assignment1;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        while(num2 != 0) {
            long rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        System.out.println(num1);
    }
}
