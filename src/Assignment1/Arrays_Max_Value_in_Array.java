package Assignment1;

import java.util.Scanner;

public class Arrays_Max_Value_in_Array {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int index = 0; index < size; index++){
            arr[index] = sc.nextInt();
        }
        int max = arr[0];
        for(int index = 1; index < size; index++){
            if(arr[index] > max){
                max = arr[index];
            }
        }
        System.out.println(max);
    }
}
