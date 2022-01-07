package Assignment1;

import java.util.Scanner;

public class PrintPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int num = 2;
        if (limit == 2){
            System.out.println(2);
        }
        else if (limit != 1) {
            while (num <= limit) {
                int i = 2;
                int NotPrime = 0;
                while (i < num) {
                    if(num % i == 0){
                        NotPrime = 1;
                        break;
                    }
                    i++;
                }
                if (NotPrime == 0){
                    System.out.println(i);
                }
                num++;
            }
        }
    }
}
