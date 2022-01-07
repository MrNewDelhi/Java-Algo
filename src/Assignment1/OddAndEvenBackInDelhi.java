package Assignment1;

import java.util.Scanner;

public class OddAndEvenBackInDelhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases > 0) {
            long carNumber = sc.nextLong();
            long sumEven = 0L;
            long sumOdd = 0L;
            while(carNumber != 0L){
                long digit = carNumber % 10;
                if(digit % 2 == 0){
                    sumEven += digit;
                }
                else{
                    sumOdd += digit;
                }
                carNumber /= 10L;
            }
            if(sumEven % 4 == 0 || sumOdd % 3 == 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            testCases--;
        }
    }
}
