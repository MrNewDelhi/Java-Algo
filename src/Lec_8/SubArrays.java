package Lec_8;

public class SubArrays {
    public static void main(String[] args) {
     int[] arr = {10,20,30,40};
     Sub(arr);
    }
    public static void Sub(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++){
                display(arr,i,j);
            }
        }
    }

    public static void display(int[] arr,int start, int end){
        for (;start<=end;start++) {
            System.out.print(arr[start] + " ");
        }
        System.out.println();
    }
}
