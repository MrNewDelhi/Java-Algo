package Assignment1;

import java.util.Scanner;

public class BostonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sumFactors = 0;
        int sumDigits = 0;
        int temp = input;
        while (temp > 0) {
            int digit = temp % 10;
            sumDigits += digit;
            temp /= 10;
        }
        while(input > 1) {
            int factor = 2;
            while (factor <= input) {
                if (input % factor == 0) {
                    if (factor == 2) {
                        sumFactors += factor;
                        input /= factor;
                        break;
                    } else {
                        int i = 2;
                        int NotPrime = 0;
                        while (i < factor) {
                            if (factor % i == 0) {
                                NotPrime = 1;
                                break;
                            }
                            i++;
                        }
                        if (NotPrime == 0) {
                            int temp1 = factor;
                            while(factor > 0){
                                int digit = factor % 10;
                                sumFactors += digit;
                                factor /= 10;
                            }
                            input /= temp1;
                            break;
                        }
                    }
                }
                factor++;
            }

        }
        if(sumDigits == sumFactors){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
