package Assignment1;

import java.util.Scanner;

public class Arrays_Target_Sum_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int index = 0; index < size; index++){
            arr[index] = sc.nextInt();
        }
        int target = sc.nextInt();
        for(int index_i = 0; index_i < size - 2; index_i++){
            int key = target - arr[index_i];
            if(key > 0) {
                for (int index_j = index_i + 1; index_j < size; index_j++) {
                    if(key == arr[index_j]){
                        if(arr[index_i] < arr[index_j]) {
                            System.out.println(arr[index_i] + " and " + arr[index_j]);
                        }else {
                            System.out.println(arr[index_j] + " and " + arr[index_i]);
                        }
                        break;
                    }
                }
            }
        }
    }
}
