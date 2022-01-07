package Assignment1;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        long min = 0L;
        long mul = 1L;
        if (num1 > num2) {
            min = num2;
        } else {
            min = num1;
        }
        while (true) {
            long i = 2;
            int NotDivisible = 0;
            while (i <= min) {
                if (num1 % i == 0 && num2 % i == 0) {
                    mul *= i;
                    num1 /= i;
                    num2 /= i;
                    min /= i;
                    NotDivisible = 0;
                    break;
                }
                else{
                    NotDivisible = 1;
                }
                i++;
            }
            if(NotDivisible == 1 || i > min){
                break;
            }
        }
        if (num1 != 0 ) {
            mul *= num1;
        }
        if (num2 != 0) {
            mul *= num2;
        }
        System.out.println(mul);
    }
}
//10000000 99999222
