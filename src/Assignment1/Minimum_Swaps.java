package Assignment1;

import java.util.Scanner;

public class Minimum_Swaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int index = 0; index < size; index++){
            arr[index] = sc.nextInt();
        }
        System.out.println(Selection_Sort(arr));
    }
    public static int Selection_Sort(int[] arr){
        int count = 0;
        for(int last = arr.length-1; last > 0; last--) {
            int max_index = last;
            for (int index = 0; index <= last; index++) {
                if (arr[index] > arr[max_index]) {
                    max_index = index;
                }
            }
                if(max_index != last) {
                    swap(arr, max_index, last);
                    count++;
                }
            }
        return count;
    }
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] =  arr[index2];
        arr[index2] = temp;
    }
}
