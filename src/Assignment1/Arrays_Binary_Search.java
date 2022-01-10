package Assignment1;

import java.util.Scanner;

public class Arrays_Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int index = 0; index < size; index++) {
            arr[index] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(Binary_Search(arr,key));
    }
    public static int Binary_Search(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] < key){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}