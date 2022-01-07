package Lec_8;

import java.util.Scanner;

public class Rotating_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50};
        int times = sc.nextInt();
        times %= arr.length;
        if(times < 0){
            times+= arr.length;
        }

        while(times > 0) {
            rotate(arr);
            times--;
        }

        display(arr);
    }

    public static void rotate(int[] arr){
        int temp = arr[arr.length - 1];
        for(int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

    public static void rev(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void Improved_Rotation(int[] arr, int r){
        rev(arr, 0, arr.length-1-r);
        rev(arr,arr.length-r, arr.length-1);
        rev(arr,0, arr.length-1);
    }

    public static void display(int[] arr){
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
