package Assignment1;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long integer = sc.nextLong();
        int count = 0;
        while(num!=0L){
            long digit = num % 10;
            if(digit == integer){
                count++;
            }
            num /= 10L;
        }
        System.out.println(count);
    }
}
