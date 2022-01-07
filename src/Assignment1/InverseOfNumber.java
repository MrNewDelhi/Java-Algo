package Assignment1;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int res = 0;
        int i = 1;
        while(input != 0){
            int mul = 1;
            int power = input % 10;
            while(power > 1){
                mul *= 10;
                power--;
            }
            res = i * mul + res;
            i++;
            input /= 10;
        }
        System.out.println(res);
    }
}
