package Lec_7;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printArm(n);
    }
    public static void printArm(int n){
        for(int i = 1; i <= n; i++){
            if(isArmStrong(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isArmStrong(int num){
        int nod = nod(num);
        int new_num = 0;
        int copy = num;
        while(num > 0){
            int digit = num % 10;
            new_num = new_num + (int)Math.pow(digit,nod);
            num /= 10;
        }
        return new_num == copy;
    }
    public static int nod(int num){
        int ans = 0;
        while (num > 0){
            num/=10;
            ans++;
        }
        return ans;
    }
}
