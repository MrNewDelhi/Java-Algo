package Assignment1;

import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long rev = 0L;
        while(num != 0L){
            long digit = num % 10L;
            num /= 10L;
            rev = (rev * 10L) + digit;
        }
        System.out.println(rev);
    }
}
