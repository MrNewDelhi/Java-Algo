package Assignment1;

import java.util.Scanner;

public class VonNeumanLovesBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0) {
            long num = 0L;
            long n = sc.nextLong();
            long mul = 1;
            while (n != 0L) {
                long digit = n % 10L;
                num = num + digit * mul;
                mul *= 2;
                n /= 10L;
            }
            testCases--;
            System.out.println(num);
        }
    }
}
