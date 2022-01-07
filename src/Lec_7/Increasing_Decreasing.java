package Lec_7;

import java.util.Scanner;

public class Increasing_Decreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean increasing = false;
        int prev = sc.nextInt();
        while(n - 1 > 0){
            int curr = sc.nextInt();
            if(curr <= prev && increasing){
                System.out.println("False");
                break;
            }
            if(curr == prev){
                System.out.println("False");
                break;
            }
            if(curr > prev){
                increasing = true;
            }
            prev = curr;
            n--;
        }
        if(n==0) {
            System.out.println("true");
        }
    }
}