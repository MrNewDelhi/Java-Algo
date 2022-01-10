package Assignment1;

import java.util.Scanner;

public class Squares_Of_A_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] result = new int[size];
        for(int index = 0; index < arr.length; index++){
            arr[index] = sc.nextInt();
        }
        result[0] = arr[0] * arr[0];
        for(int index_i = 1; index_i < arr.length; index_i++){
            int num = arr[index_i] * arr[index_i];
            int index = index_i - 1;
            while(index != -1 && num < result[index]){
                result[index + 1] = result[index];
                index--;
            }
            result[index+1] = num;
        }
        for(int index = 0; index < size; index++){
            System.out.print(result[index] + " ");
        }
    }
}
