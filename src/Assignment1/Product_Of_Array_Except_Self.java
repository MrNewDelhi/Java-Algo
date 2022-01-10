package Assignment1;

import java.util.Scanner;

public class Product_Of_Array_Except_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int index = 0; index < arr.length; index++){
            arr[index] = sc.nextInt();
        }
        for(int index_i = 0; index_i < arr.length; index_i++){
            long product = 1;
            for(int index_j = 0; index_j < arr.length; index_j++){
                if(index_j != index_i){
                    product *= arr[index_j];
                }
            }
            System.out.print(product + " ");
        }
    }
}
