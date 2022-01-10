package Assignment1;

import java.util.Scanner;

public class Running_Sum_Of_Given_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int index = 0; index < arr.length; index++){
            arr[index] = sc.nextInt();
        }
        for(int index_i = 0; index_i < arr.length; index_i++){
            long sum = 0;
            for(int index_j = 0; index_j <= index_i; index_j++){
                    sum += arr[index_j];
            }
            System.out.print(sum + " ");
        }
    }
}