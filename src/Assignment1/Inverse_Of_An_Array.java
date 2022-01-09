package Assignment1;

import java.util.Scanner;

public class Inverse_Of_An_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        Input(arr,size,0);
        for (int elements: arr) {
            System.out.print(elements + " ");
        }
    }
    public static int Input(int[] arr, int size, int count){
        if(count == size){
            return 0;
        }
        else{
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            arr[input] = count;
            return Input(arr,size,count+1);
        }
    }
}
