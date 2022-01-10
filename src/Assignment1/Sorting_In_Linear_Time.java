package Assignment1;

import java.util.Scanner;

public class Sorting_In_Linear_Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] result = new int[size];
        int ones = 0;
        int twos = 0;
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 1){
                ones++;
            }
            else if(arr[i] == 2){
                twos++;
            }
        }
        int last_index = size-1;
        int i = 0;
        while(i < twos){
            result[last_index] = 2;
            last_index--;
            i++;
        }
        i = 0;
        while(i < ones){
            result[last_index] = 1;
            last_index --;
            i++;
        }
        for(int j = 0; j < size; j++){
            System.out.print(result[j] + " ");
        }
    }
}
