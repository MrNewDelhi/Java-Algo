package Assignment1;

import javax.sound.sampled.Line;
import java.util.Scanner;

public class Arrays_Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int index = 0; index < arr.length; index++){
            arr[index] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.print(LinearSearch(arr,key));

    }
    public static int LinearSearch(int[] arr, int key){
        for(int index = 0; index < arr.length; index++){
            if(key == arr[index]){
                return index;
            }
        }
        return -1;
    }
}
