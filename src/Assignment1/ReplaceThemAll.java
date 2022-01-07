package Assignment1;

import java.util.Scanner;

public class ReplaceThemAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long rev = 0L;
        long mul = 1L;
        if (num == 0) {
            rev = 5;
        } else {
            while (num != 0L) {
                long digit = num % 10L;
                if (digit == 0) {
                    digit = 5;
                }
                rev = rev + digit * mul;
                mul *= 10L;
                num /= 10L;
            }
        }
        System.out.println(rev);
    }
}
