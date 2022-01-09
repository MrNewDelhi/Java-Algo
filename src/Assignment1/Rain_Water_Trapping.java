package Assignment1;

import java.util.Scanner;

public class Rain_Water_Trapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases > 0){
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int index = 0; index < size; index++){
                arr[index] = sc.nextInt();
            }
            Bubble_Sort(arr);
            for(int element : arr){
                System.out.println(element);
            }
            int total_water_filled = 0;
            for(int index = 0; index < size-1; index++){
                total_water_filled += (arr[size-2] - arr[index]);
            }
            System.out.println(total_water_filled);
            testcases--;
        }
    }
    public static void Bubble_Sort(int[] arr){
        int size = arr.length;
        for(int index = 0;index < size; index++){
            for(int current = 0; current < size - 1; current++){
                if(arr[current] > arr[current + 1]) {
                    swap(arr, current, current + 1);
                }
            }
        }
    }
    public static void swap(int[] arr, int current, int next){
        int temp = arr[current];
        arr[current] = arr[next];
        arr[next] = temp;
    }
}
