package Assignment1;

import java.util.Scanner;

public class Increasing_Decreasing_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num1 = sc.nextInt();
        if(size == 1){
            System.out.print("false");
        } else {
            int num2 = sc.nextInt();
            int ans = 1;
            if(isIncreasingOrDecreasing(num1,num2) == 1){
                for(int i = 0; i < size - 2; i++){
                    num1 = num2;
                    num2 = sc.nextInt();
                    if(isIncreasingOrDecreasing(num1,num2) == 0){
                        ans = 0;
                        break;
                    }
                }
            }
            else{
                for(int i = 0; i < size - 2; i++){
                    num1 = num2;
                    num2 = sc.nextInt();
                    if(isIncreasingOrDecreasing(num1,num2) == 1){
                        ans = 0;
                        break;
                    }
                }
            }
            if(ans == 1){
                System.out.print("true");
            }
        }
    }
    public static int isIncreasingOrDecreasing(int num1, int num2){
        if(num1 > num2){
            return 1;
        }
        else{
            return 0;
        }
    }
}
