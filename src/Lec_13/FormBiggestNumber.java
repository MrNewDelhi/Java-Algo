package Lec_13;

import java.util.Scanner;

public class FormBiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0){
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int i = 0; i < size; i++){
                arr[i] = sc.nextInt();
            }

            testCases--;
        }
    }
}
