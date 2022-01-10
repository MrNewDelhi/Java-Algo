package Assignment1;

import java.util.Scanner;

public class Arrays_Reverse_An_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int index = 0; index < size; index++){
            arr[index] = sc.nextInt();
        }
        for(int index = size - 1; index >= 0; index--){
            System.out.println(arr[index]);
        }
    }
}
