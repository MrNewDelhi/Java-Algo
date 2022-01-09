package Assignment1;

import java.util.Scanner;

public class Zeros_At_End_Time_Complexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int index = 0;
        for(int loop_index = 0; loop_index < size; loop_index++){
            int input = sc.nextInt();
            if(input!=0){
                arr[index] = input;
                index++;
            }
        }
        for(int elements : arr){
            System.out.print(elements + " ");
        }
    }
}
