package Assignment1;

import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        long res = 0L;
        long mul = 1L;
        while(input > 9L){
            long digit = input % 10L;
            if((9-digit) < digit){
                digit = 9L - digit;
            }
            res = digit * mul  + res;
            input /= 10L;
            mul *= 10L;
        }
        if(input != 9 && (9 - input) < input){
            res = (9-input) * mul + res;
        }
        else {
            res = input * mul + res;
        }
        System.out.println(res);
    }
}
