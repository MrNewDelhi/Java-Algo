package Lec_7;

public class Basic_Array {
    public static void main(String[] args) {
        int[] arr1 = {10,20,10,2,3,99,1,2};
        Max(arr1);
        find(arr1,10);
//        rev(arr1);
        swap(arr1);
    }
    public static int Max(int[] arr){
        int max = arr[0];
//        max = Integer.MIN_VALUE
        for (int element : arr) {
            if(max > element){
                max = element;
            }
        }
        return max;
    }
    public static int find(int[] arr, int key){
        int found = 0;
        for (int element = 0; element < arr.length; element++) {
            if(key == element){
                found = 1;
                System.out.println(arr[element]);
                break;
            }
        }
        return found;
    }
    public static void rev(int[] arr){
        for (int element = 0; element < arr.length/2 + 1; element++) {
            int temp = arr[element];
            arr[element] = arr[arr.length - element - 1];
            arr[arr.length-element-1] = temp;
        }
        for (int elem :
                arr) {
            System.out.println(elem);
        }
    }
    public static void swap(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int elem :
                arr) {
            System.out.println(elem);
        }
    }
}
