package Assignment1;

import java.util.Scanner;

public class SumOfOddPlacedAndEvenPlacedDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long sumOdd = 0L;
        long sumEven = 0L;
        long rev = 0L;
        int i = 0;
        while(num != 0L){
            long digit = num % 10L;
            rev = rev * 10 + digit  ;
            num /= 10L;
            i++;
            if(i % 2 == 0){
                sumEven += digit;
            }
            else {
                sumOdd += digit;
            }
        }
        System.out.println(sumOdd);
        System.out.println(sumEven);
    }
}
