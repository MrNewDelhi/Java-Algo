package Assignment1;

import java.util.Scanner;

public class Sort_just_zeroes_and_ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int index = size-1;
        for(int loop_index = size-1; loop_index >= 0; loop_index--){
            int input = sc.nextInt();
            if(input == 1){
                arr[index] = 1;
                index--;
            }
        }
        for (int element:
             arr) {
            System.out.print(element + " ");
        }
    }
}
